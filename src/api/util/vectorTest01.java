package api.util;

import java.util.Vector;

//Vector�� ����� ����ϴ� ���
public class vectorTest01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		//v.add("java");			//String (X)
		v.add(10);
		System.out.println("Vector �뷮 : " + v.capacity());		//�� ������
		System.out.println("Vector�� ����� ����� ���� : " + v.size());		//����� ����
		
		System.out.println("---------------------------------");
		for(int i=0;i<10;i++)
			v.add(10);
		System.out.println("Vector �뷮 : " + v.capacity());		//�� ������
		System.out.println("Vector�� ����� ����� ���� : " + v.size());		//����� ����
		
		System.out.println("---------------------------------");
		for(int i=0;i<20;i++)
			v.add(10);
		System.out.println("Vector �뷮 : " + v.capacity());		//�� ������
		System.out.println("Vector�� ����� ����� ���� : " + v.size());		//����� ����
		
		System.out.println("---------------------------------");
		for(int i=0;i<20;i++)
			v.add(10);
		System.out.println("Vector �뷮 : " + v.capacity());		//�� ������
		System.out.println("Vector�� ����� ����� ���� : " + v.size());		//����� ����
		
		System.out.println("---------------------------------");
		for(int i=0;i<40;i++)
			v.add(10);
		System.out.println("Vector �뷮 : " + v.capacity());		//�� ������
		System.out.println("Vector�� ����� ����� ���� : " + v.size());		//����� ����
		
	}

}