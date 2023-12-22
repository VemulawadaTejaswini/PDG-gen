import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int x = in.nextInt();
		int counter = 0;
		for(int i = 0, suma = 0; i <= a && suma < x; i++){
			suma = 500 * i;
			if (suma == x) { counter++; break;}
			for(int j = 0, sumb = 0; j <= b && sumb < x; j++){
				sumb = suma + 100 * j;
				if (sumb == x) { counter++; break;}
				for(int k = 0, sumc = 0; k <= c && sumc < x; k++){
					sumc = sumb + 50 * k;
					if (sumc == x) { counter++; break;}
							
				}
			}
		}
		
		System.out.println(counter++);
	}

}
