import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String abcd = scan.next();
		scan.close();

		String[] array = abcd.split("");
		int a = Integer.valueOf(array[0]);
		int b = Integer.valueOf(array[1]);
		int c = Integer.valueOf(array[2]);
		int d = Integer.valueOf(array[3]);

		int[] symbol = {-1, 1};
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 2; k++) {
					if(a + b * symbol[i] + c * symbol[j] + d * symbol[k] == 7) {
						System.out.print(a);
						System.out.print(i == 0?"-":"+");
						System.out.print(b);
						System.out.print(j==0?"-":"+");
						System.out.print(c);
						System.out.print(k==0?"-":"+");
						System.out.print(d);
						System.out.println("=7");
						return;
					}
				}
			}
		}
	}
}
