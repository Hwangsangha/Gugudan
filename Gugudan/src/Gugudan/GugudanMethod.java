package Gugudan;

public class GugudanMethod {
	//구구단 함수
	public static int[] calc(int times) {
		int[] result = new int[9]; 
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;//반환타입 일치시키기
	}
	
	//출력함수
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
//	public static void main(String[] args) {
//		int[] result = calc(2);//구구단 함수 2단을 result배열에 적재
//		print(result);
		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);//적재된 2단을 출력
//		}
//		result = calc(4);//배열에 4단 덮어쓰기
//		print(result);
		
//		for(int i = 2; i < 10; i++) {
//			int[] result = calc(i);//구구단함수 calc에 반복문으로 2~9단 입력, result 배열에 적재
//			print(result);
//		}
//	}
}
