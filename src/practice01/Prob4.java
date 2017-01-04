package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String value =scan.nextLine();
		
		for(int i =0; i<value.length(); i++){
			
			for(int j=0; j<i+1; j++){
				System.out.print(value.charAt(j));
			}
			System.out.println(" ");
		}
	}
}
