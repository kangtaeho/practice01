package practice01;

public class Prob5_1 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {

			String sNumber = String.valueOf(i);
	


			int length = sNumber.length();
			if (length == 1) {
				if (i == 3 || i == 6 || i == 9) {
					System.out.println(i + "짝");
				}
			}else if(9<i){
				if(sNumber.charAt(1)=='3'||sNumber.charAt(1)=='6'||sNumber.charAt(1)=='9'){
					System.out.print(i+"짝");
					if(sNumber.charAt(0)=='3'||sNumber.charAt(0)=='6'||sNumber.charAt(0)=='9'){
						System.out.print("짝");
					}
					System.out.println("");
				}
				
			
			

		}

	}

	}
}
