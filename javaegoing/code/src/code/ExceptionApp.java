package code;

import java.io.IOException;

public class ExceptionApp{
	public static void main(String[] args) throws IOException {
		System.out.println(1);
		
		int[] scores = {10, 20, 30};
		
		try {
			
		System.out.println(2);
		System.out.println(3);
		//System.out.println(scores[3]);
		System.out.println(2/0);
		System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println("계산이 잘못된 것 같아요"+e.getMessage());
			e.printStackTrace();
		
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("없는 값을 찾고 계십니다.");
//		} catch (ArithmeticException e) {
//			System.out.println("잘못된 계산이네요. ");
		}
		System.out.println(5);
	}
}
