package proCon_minnano2019_20190209;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n,k;
    	n = in.nextInt();
    	k = in.nextInt();
    	String ans = "NO";
    	if (k <= (n/2 + n%2)) ans = "YES";
    	
    	System.out.println(ans);
    }
}
