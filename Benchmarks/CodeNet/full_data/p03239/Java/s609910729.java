import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int N = parseInt(sc.next());
		int T = parseInt(sc.next());
		CtClass[] ct = new CtClass[N];
		for(i=0;i<N;i++) {
			ct[i] = new CtClass(parseInt(sc.next()), parseInt(sc.next()));
		}
		sc.close();
		Arrays.sort(ct,(a, b)-> a.t -b.t);
		int min=1001;
		for(i=0;i<N;i++) {
			if(ct[i].t > T) break;
			if(ct[i].c < min) min =ct[i].c; 
		}
		if(min == 1001) System.out.println("TLE");
		else System.out.println(min);
	}
}
class CtClass {
	int c;
	int t;
	CtClass(int c, int t) {
		this.c = c;
		this.t = t;
	}
}