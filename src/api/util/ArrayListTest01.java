package api.util;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		//E는 ArrayList를 사용하는 시점에 정의하는 데이터 타입
		//ArrayList에 저장되는 요소의 타입
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		for(int i=0;i<10;i++)
			list.add(i);
		
		System.out.println("ArrayList Size : " + list.size());
		
		System.out.println("ArrayList 요소 > ");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}

}
