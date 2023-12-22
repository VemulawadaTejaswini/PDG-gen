import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = 0;

		if((b - a) > (c - b) && (b - a) > (K - c + a)){
			min = (c - b) + (K - c) + a;
		}else if((c - b) > (K - c + a) && (c - b) > (b - a)){
			min = (K - c) + a + (b - a);
		}else if((K - c + a) > (b - a) && (K - c + a) > (c - b)){
			min = (b - a) + (c - b);
		}

		System.out.println(min);
		sc.close();
	}
}
