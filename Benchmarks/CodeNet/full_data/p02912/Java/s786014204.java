import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		double[][] a = new double[n][4];
		for(int i = 0; i < n; i++){
		    a[i][0] = i+1;
		    a[i][1] = sc.nextDouble();
		    a[i][3] = a[i][1];
		}
		Arrays.sort(a, (x, y) -> Double.compare(y[1], x[1]));
		
		// 計算
		long result = 0;
		for(int i = 0; i < m; i++){
		    double p = 0;
		    /*
		    if(a[0][1]%2 == 0){
		        p = a[0][1]/2;
		    }else{
		        p = a[0][1]/2 + 1;
		    }*/
		    p = a[0][1]/2;
		    a[0][1] = p;
		    a[0][2]++;
		    Arrays.sort(a, (x, y) -> Double.compare(y[1], x[1]));
		}
		Arrays.sort(a, (x, y) -> Double.compare(x[0], y[0]));
		/*
		for(int i = 0; i < n; i++){
		    System.out.println(a[i][0] + " " + a[i][1] + " " + a[i][2] + " " + a[i][3]);
		}*/
		
		for(int i = 0; i < n; i++){
		    result += ((long)a[i][3])/(pow(2, (int)a[i][2]));
		}
		// 出力
		System.out.println(result);
		
	}
	public static long pow(long a,long n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a);
	        }
	        a=(a*a);
	        n>>=1;
	    }
	    return res;
	}

}
