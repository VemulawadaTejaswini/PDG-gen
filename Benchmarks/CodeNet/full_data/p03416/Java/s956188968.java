import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int res = 0;
		for (int i=A; i<=B; i++){
			if ( i/10000%10 == i%10 && i/1000%10 == i/10%10) {
				res++;
			}
		}
		System.out.println(res);
	}
}
