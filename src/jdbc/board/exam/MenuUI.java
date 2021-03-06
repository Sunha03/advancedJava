package jdbc.board.exam;

import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new boardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
	
		
		//여기에서 boardDAO의 메소드를 호출하세요
		BoardDTO dto = new BoardDTO(id, title, content);
		int result = dao.insert(dto);
		//결과 처리
		if(result > 0) {
			System.out.println("게시물 등록 성공!");
		}
		else {
			System.out.println("게시물 등록 실패..");
		}
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		
		//여기에서 boardDAO의 메소드를 호출하세요
		int result = dao.update(id,  boardNum);
		//결과 처리
		if(result > 0) {
			System.out.println("게시물 수정 성공!");
		}
		else {
			System.out.println("게시물 수정 실패..");
		}
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		//여기에서 boardDAO의 메소드를 호출하세요
		int result = dao.delete(boardNum);
		//결과 처리
		if(result > 0) {
			System.out.println("게시물 삭제 성공!");
		}
		else {
			System.out.println("게시물 삭제 실패..");
		}
	}
	public void searchMenu(){
		System.out.println("*******게시글검색********");
		System.out.print("제목:");
		String title = key.next();
		//여기에서 boardDAO의 메소드를 호출하세요
		
	}
	
	
	public void selectMenu(){
		System.out.println("*******게시글조회********");
		//여기에서 boardDAO의 메소드를 호출하세요 - 전체사원조회
		dao.select();
		//결과 처리
		/*if(result > 0) {
			System.out.println("게시물 조회 성공!");
		}
		else {
			System.out.println("게시물 조회 실패..");
		}*/
	}
}


















