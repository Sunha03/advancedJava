package api.util;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		//E�� ArrayList�� ����ϴ� ������ �����ϴ� ������ Ÿ��
		//ArrayList�� ����Ǵ� ����� Ÿ��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		for(int i=0;i<10;i++)
			list.add(i);
		
		System.out.println("ArrayList Size : " + list.size());
		
		System.out.println("ArrayList ��� > ");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}

}