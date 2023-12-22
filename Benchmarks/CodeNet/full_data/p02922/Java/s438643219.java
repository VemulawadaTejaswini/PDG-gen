import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int tap = 1;
	    int ans = 0;
	    while(tap < B){
	    	tap--;
	    	tap += A;
	    	ans++;
	    }
	    System.out.println(ans);

		stdIn.close();
	}
}
