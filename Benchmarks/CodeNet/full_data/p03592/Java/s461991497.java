import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        boolean ans = false;
        for(int n=0;n<=N;n++){
        	for(int m=0;m<=M;m++){
        		int black = n*m + (N-n)*(M-m);
        		if(black==K) ans = true;
        	}
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }
}