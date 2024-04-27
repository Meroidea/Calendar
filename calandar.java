package firstProg;

public class suj {
	public static void main(String[] args) {
		System.out.println("Calander 2024 \n January \n\n Mo Tu We Th Fr Sa Su");

		int i;
		int j;
		int num = 1;
		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= 7; j++) {
				if (i == 5 && j == 4 || i == 5 && j == 5 || i == 5 && j == 6 || i == 5 && j == 7) {
					System.out.print(" ");
				} else {
					System.out.printf("%3d", num);
					num++;
				}
			}
			System.out.println();

		}

	}

}
