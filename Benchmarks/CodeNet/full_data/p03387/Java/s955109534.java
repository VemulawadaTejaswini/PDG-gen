import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int[] abc = new int[3];
		abc[0] = parseInt(sc.next());
		abc[1] = parseInt(sc.next());
		abc[2] = parseInt(sc.next());
		sc.close();
		Arrays.sort(abc);
		int sum = 2*abc[2]-abc[0]-abc[1];
		int ans=0;
		if(sum%2==0) {
			ans = sum/2;
		} else {
			ans = (sum+3)/2;
		}
		out.println(ans);;
	}
}
