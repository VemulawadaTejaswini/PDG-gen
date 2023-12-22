import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();

		scan.close();
		int ans = 0;
	    while(true){
	      int n = (a * ans) - (ans - 1);
	      if(b <= n) break;
	      ans++;
	    }
	    System.out.println(ans);

	}
}