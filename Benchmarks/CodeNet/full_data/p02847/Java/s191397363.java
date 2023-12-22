import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		long X = sc.nextLong();


		long startNum = 0;

		for(int i=1; i<=1000000000; i*=10) {
			startNum = i;
			if (A*i + B*String.valueOf(i).length() > X) {
				if(i == 1) {
					System.out.print("0");
					sc.close();
					return;
				}
				break;
			}
		}
		
		if(startNum == 1000000000) {
			for(int i=100000000; i<=1000000000; i+=1000000000) {
				startNum = i;
				if (A*i + B*String.valueOf(i).length() > X) {
					break;
				}
			}
		}
			

		for (long N = startNum; N > 0; N--) {
			long value = A * N + B * String.valueOf(N).length();
			if (X > value) {
				System.out.print(N);
				sc.close();
				return;
			}
		}

		sc.close();

	}

}
