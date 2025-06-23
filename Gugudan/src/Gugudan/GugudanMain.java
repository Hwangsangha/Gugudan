package Gugudan;

public class GugudanMain {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int[] result = GugudanMethod.calc(i);//다른 클래스 명을 입력후 .메서드
			GugudanMethod.print(result);
		}
	}
}
