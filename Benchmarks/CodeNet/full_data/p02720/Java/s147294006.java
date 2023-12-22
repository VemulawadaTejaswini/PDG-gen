import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		Queue<Long> qe = new ArrayDeque<Long>();
		if(n < 10) ou.println(n);
		else{
			for(int i = 1 ; i <= 9 ; i++) qe.add((long)i);
			for(int i = 0 ; i < n - 1 ; i++){
				long a = qe.poll();
				if(a % 10 != 0) qe.add(10 * a - 1 + (a % 10));
				qe.add(10 * a + a % 10);
				if(a % 10 != 9) qe.add(10 * a + 1 + (a % 10));
			}
			ou.println(qe.poll());
		}
		ou.flush();
	}
}