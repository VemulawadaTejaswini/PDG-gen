import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1) {
		    System.out.println(sc.nextInt());
		}
		else {
		    double cur = (sc.nextInt() + sc.nextInt()) / 2.0;
		    for(int i=2;i<n;i++) {
		        cur = (cur + sc.nextInt()) / 2.0;
		    }
		    System.out.println(cur);
		}
	}
}