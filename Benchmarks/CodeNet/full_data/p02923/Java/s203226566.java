import java.io.*;
import java.util.*;

public class Main{
	public static void main (String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int best = 0;
		int last = cin.nextInt();
		int cur = 0;
		for(int i=1;i<n;i++) {
		    int next = cin.nextInt();
		    if(last >= next) {
		        cur++;
		    }
		    else {
		        cur = 0;
		    }
		    last = next;
		    best = Math.max(best, cur);
		}
		System.out.println(best);
	}
}