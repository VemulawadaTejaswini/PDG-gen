import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    int k = scan.nextInt();
	    scan.close();
	    int max=Math.max(a, Math.max(b, c));
	    int ans=max*(int)Math.pow(2,k);
	    System.out.println(ans+a+b+c-max);
	}

}
