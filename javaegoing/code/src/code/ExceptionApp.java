package code;

import java.io.IOException;

public class ExceptionApp{
	public static void main(String[] args) throws IOException {
		System.out.println(1);
		
		int[] scores = {10, 20, 30};
		
		try {
			
		System.out.println(2);
		System.out.println(3);
		System.out.println(scores[3]);
		System.out.println(2/0);
		System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ���� ã�� ��ʴϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("�߸��� ����̳׿�. ");
		}
		System.out.println(5);
	}
}
