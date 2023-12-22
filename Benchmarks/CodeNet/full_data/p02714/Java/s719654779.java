import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }
  static void resolve(InputStream is, PrintStream pw) {
	    Scanner sc = new Scanner(is);
	    int n = Integer.parseInt(sc.next());
	    String S = sc.next();
        int cnt = 0;
		for (int i=1; i < n-1; i++)
			for (int j=i+1; j <  n; j++)
				for (int k=j+1; k < n+1; k++)
					if ((j-i) != (k-j)
						&& S.charAt(i-1)!=S.charAt(j-1)
						&& S.charAt(i-1)!=S.charAt(k-1)
						&& S.charAt(j-1)!=S.charAt(k-1)
						)
						cnt++;
		pw.println(cnt);
	}
}
