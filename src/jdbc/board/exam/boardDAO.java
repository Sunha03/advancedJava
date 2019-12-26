package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import basic.java.preparedInsertTest;

//tb_board ���̺��� �׼����ϴ� ����� ���ǵ� Ŭ����
public class boardDAO {

	public void insert(String id, String title, String content) {
		String sql = "INSERT INTO tb_board VALUES(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			con = DBUtil.getConnect();
			
			//1.PreparedStatement ����
			ptmt = con.prepareStatement(sql);

			//2. '?'�� �� ����
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			int res = ptmt.executeUpdate();
			System.out.println("Insert ����!");
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {		//Exception�� �߻��ϰų� �߻����� �ʰų� ������ ������ ��ɹ� ����
			try {
				if(ptmt != null)
					ptmt.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(String id, int boardnum) {
		String sql = "UPDATE tb_board SET id=? WHERE boardnum=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, id);
			ptmt.setInt(2, boardnum);
			
			int res = ptmt.executeUpdate();
			System.out.println("���� ����!" + res);
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {
			try {
				if(ptmt != null)
					ptmt.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(int boardnum) {
		String sql = "DELETE tb_board WHERE boardnum=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			ptmt.setInt(1, boardnum);
			
			int res = ptmt.executeUpdate();
			System.out.println("1�� ���� �����ƽ��ϴ�.");
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {
			try {
				if(ptmt != null)
					ptmt.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void select() {
		String sql = "SELECT * FROM tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);

			int res = ptmt.executeUpdate();
			//Select�� ����
			ResultSet rs = ptmt.executeQuery();
			//ResultSet�� ���ڵ尡 �����ϴ� ���� �ݺ��� ����
			while(rs.next()) {			//���ڵ带 ��ȸ�ϱ� ���ؼ��� ���ڵ尡 1���� �ݵ�� Ŀ���� �̵����Ѿ� ��
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" 
						+ rs.getString(3) + "\t" + rs.getString("content") + "\t"
						+ rs.getString(5) + "\t" + rs.getString(6));
			}
		}
		catch (SQLException e) {
			System.out.println("ERROR! " + e.getMessage());
		} finally {
			try {
				if(ptmt != null)
					ptmt.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
