import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int min = 1;
		String app = "";
		int step = 1;
		for (int i = 0; i < k; i++) {
			System.out.print(step + app);
			step++;
			if (step == 10) { 
				step = 1;
				app += "9";
			}
			System.out.println();
		}
	}

}
