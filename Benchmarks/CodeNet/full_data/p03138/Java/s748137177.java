

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int N=gi();
        long K=gl();
        long[] A=new long[N];

        long sum=0;
        for (int i=0;i<N;i++) {
        	A[i]=gl();
        	sum+=A[i];
        }

        long m=1;
        long x=0;
        while(m<=K) {
        	long tmp=0;
        	for (int i=0;i<N;i++) {
        		tmp+=(A[i]^m);
        	}
        	if(tmp>sum) {
        	    x+=m;
        	}
        	m*=2;
        }
        if(x>K)x-=m;
        long ans=0;
        for (int i=0;i<N;i++) {
        	ans+=(A[i]^x);
        }

        System.out.println(ans);
    }

    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}