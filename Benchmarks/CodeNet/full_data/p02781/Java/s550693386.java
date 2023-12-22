import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();

		Integer ans = 0;

		if(k==1) {
			ans = Integer.parseInt(s.substring(0,0));
		}else if(k==2) {
			int n = Integer.parseInt(s.substring(0,0));
			int n1 = Integer.parseInt(s.substring(1,1));

			ans += n*n1;
			ans += n*9*(s.length()-2);
		}else if(k==3) {
			int n = Integer.parseInt(s.substring(0,0));
			int n1 = Integer.parseInt(s.substring(1,1));
			int n2 = Integer.parseInt(s.substring(2,2));

			ans += n*n1*n2;
			ans += n*n1*9*(s.length()-3);
			ans += n*9*9*(((s.length()-2)*(s.length()-3))/2);

		}

		System.out.println(ans);



	}
}
