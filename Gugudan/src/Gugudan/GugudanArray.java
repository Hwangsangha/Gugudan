package Gugudan;

public class GugudanArray {
	public static void main(String[] args) {
		int[] result = new int[9];//result밸 선언 
		for(int i = 0; i < result.length; i++) {
			result[i] = 2 * (i + 1);// 배열에 2~18까지 적재
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);//인덱스0번부터 차례대로 출력
		}
		
		result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = 3 * (i + 1);
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
