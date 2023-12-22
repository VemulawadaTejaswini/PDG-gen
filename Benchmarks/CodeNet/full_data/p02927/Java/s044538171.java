import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			int inputM = scan.nextInt();
			int inputD = scan.nextInt();
			if (inputM > 81) inputM = 81; 
			int ans = 0;
			int D1 = inputD / 10;
			int D2 = inputD % 10;
			for (int i=2; i <= D1; i++) {
				int calc = inputM / i;
				if(calc>10) calc = i;
					if(D1 == i) {
						if(D2>1) {
							if (calc > D2) calc = D2;
							ans+= calc-1;
						}
					} else {
						ans+= calc - 1;
					}
				
			}
			System.out.println(ans);
		}
	}

}
