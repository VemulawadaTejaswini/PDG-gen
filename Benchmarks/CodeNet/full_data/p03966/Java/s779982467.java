import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;


public class Main {
	
	public static void main(String args[]) throws IOException{

		Scanner sc=new Scanner(System.in);
		
		BigInteger TWO=new BigInteger("2");

		int n=sc.nextInt();
		BigInteger x=new BigInteger(sc.next());
		BigInteger y=new BigInteger(sc.next());		

		for(int i=0;i<n-1;i++){

			BigInteger t=new BigInteger(sc.next());
			BigInteger a=new BigInteger(sc.next());
			BigInteger X=x,Y=y;

			BigInteger A=t.multiply(y);
			BigInteger B=a.multiply(x);
			BigInteger g=A.gcd(B);
			A=A.divide(g);
			B=B.divide(g);

			x=x.multiply(A);
			y=y.multiply(B);
			g=x.gcd(y);
			x.divide(g); y.divide(g);

			if(x.compareTo(X)<0 || y.compareTo(Y)<0){
				BigInteger l=BigInteger.ZERO;
				BigInteger r=X.divide(x).max(Y.divide(y)).add(BigInteger.TEN);

				while(r.subtract(l).compareTo(BigInteger.ONE)>0){
					BigInteger mid=l.add(r).divide(TWO);
					if(x.multiply(mid).compareTo(X)>=0 && y.multiply(mid).compareTo(Y)>=0){
						r=mid;
					}else{
						l=mid;
					}
				}
				x=x.multiply(r);
				y=y.multiply(r);
			}
		}

		System.out.println(x.add(y));

	}
	
	
	
}