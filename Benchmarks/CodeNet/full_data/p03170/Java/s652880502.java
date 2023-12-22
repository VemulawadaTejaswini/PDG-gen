

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;

    private static int n, k;
    private static int[] a;
    private static int[][] dp;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        a = new int[n];
        
        dp = new int[k+1][2];

        for(int i=0; i<n; i++) a[i] = in.nextInt();

        dp[0][0] = 1;
        dp[0][1] = 0;
        
        for(int stonesLeft=1; stonesLeft<=k; stonesLeft++) {
        	for(int who=0; who<=1; who++) {
        		boolean loose=true;
        		for(int i=0; i<n; i++) {
                    if (stonesLeft-a[i]>=0 && dp[stonesLeft-a[i]][1-who]==who) {
                        dp[stonesLeft][who] = who;
                        loose = false;
                        break;
                    } 
                }
        		if (loose)
        			dp[stonesLeft][who] = 1-who;
        	}
        }
        
        System.out.println(dp[k][0]==0?"First":"Second");

    }

    private static int solve(int stonesLeft, int who) {
        //who =0 for 1st player and =1 for 2nd player
        if (stonesLeft<0) return who;
        if (stonesLeft==0) return 1-who;


        for(int i=0; i<n; i++) {
            if (solve(stonesLeft-a[i], 1-who)==who) {
                return who;
            } 
        }

        return 1-who;


    }

}
