package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true){
			System.out.print("숫자를 입력하세요 : ");
			int value = scan.nextInt();
			int sum=0;
			
			if((value % 2) == 0){
				for(int i=2; i<value+1; i+=2){
					sum=sum+i;
				}
				System.out.println("결과값 : "+sum);
				continue;
			}
			else{
				for(int i=1; i<value+1; i+=2){
					sum=sum+i;
				}
				System.out.println("결과값 : "+sum);
				continue;
			}
		}

	}

}
