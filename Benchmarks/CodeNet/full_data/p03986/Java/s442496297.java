import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] x = sc.next().toCharArray();
		sc.close();
		int tcnt = 0;
		int scnt = 0;
		int cnt=0;
		for (i = 0; i < x.length; i++) {
			if(x[i]=='S') {
				if(tcnt>0) {
					cnt+=Math.min(scnt,tcnt);
					tcnt=0;
					scnt=0;
				}
				scnt++;
			} else if(x[i]=='T') {
				tcnt++;
			} 
		}
		if(tcnt>0) {
			cnt+=Math.min(scnt,tcnt);
		}
		out.println(x.length - cnt*2);
	}
}
