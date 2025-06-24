package Gugudan;

import java.util.Scanner;

public class Gugu {
	static Scanner sc = new Scanner(System.in);
	static String inputValue = sc.nextLine();
	
	static String[] splitedValue = inputValue.split(",");
	
	static int first = Integer.parseInt(splitedValue[0]);
	static int second = Integer.parseInt(splitedValue[1]);
	
	public static void main(String[] args) {
		System.out.println("입력값");
		guguCalc(inputValue);
	}
	
	public static void guguCalc(String inputValue) {
		for (int i = 2; i <= first; i++) {
			for (int j = 1; j <= second; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}
}
