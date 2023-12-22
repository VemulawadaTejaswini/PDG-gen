import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		for(int i = A; i <= A * B; i++) {
			if(i % B == C) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		scan.close();
	}
}
