package jdbc.board.exam;

import java.util.Scanner;

public class boardDAOTest {

	public static void main(String[] args) {
		boardDAO obj = new boardDAO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("================ �Խù� ȣ�� ================");
		System.out.print("ID�� �Է��ϼ��� : ");
		String id = sc.nextLine();
		System.out.print("Title�� �Է��ϼ��� : ");
		String title = sc.nextLine();
		System.out.print("Content�� �Է��ϼ��� : ");
		String content = sc.nextLine();
		
		obj.insert(id, title, content);
		obj.delete(21);
		obj.update("son", 26);
		obj.select();
	}

}
