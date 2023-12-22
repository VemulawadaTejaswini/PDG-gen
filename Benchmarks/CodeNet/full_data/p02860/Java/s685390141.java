import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        String S;;

        S = stdin.next();

        String T = S.substring(0,N/2);

        if(T.equals(S.substring(N/2))){
        	System.out.print("Yes");
        }
        else {
        	System.out.print("No");
        }
	}
}
