import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		int ans = 0;

		if(K%2==0) {

			ans = (K/2)*(K/2);

		}else {

			ans = (K/2)*((K/2)+1);

		}

		System.out.println(ans);

	}

}
