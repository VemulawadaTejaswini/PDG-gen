import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int tmp=1;
		if(n==tmp) {
			System.out.println("1");
		}else {
			while(tmp<=n) {
				tmp*=2;
			}
			System.out.println(tmp/2);
		}
	}
}