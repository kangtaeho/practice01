package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0) {
					if (j == 3 || j == 6 || j == 9) {
						System.out.println((j) + "짝");
					}
				} else {
					if (j == 3 || j == 6 || j == 9) {
						System.out.print((i) + "" + (j) + "짝");
						if (i == 3 || i == 6 || i == 9) {
							System.out.print("짝");
						}
						System.out.println("");
						
					}
				}
			}
		}
	}
}
