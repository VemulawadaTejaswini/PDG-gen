import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double N;
		N = sc.nextLong();
		double K;
		K = sc.nextLong();
		double ans=0;
		double X=K;
		if(K<N) {ans= ans+(N-K)/N;
		 X=K;}
		double A=0.5;
      while(X>K){
                  A=A/2;
			X=X/2;
      }
		 do{
          	System.out.println("X="+X); 
          double i=Math.floor(K)-Math.floor(X/2);
			ans=ans+A*i/N;
          System.out.println("A="+A);
          System.out.println("i="+i);
                System.out.println("ans="+ans);

          A=A/2;
			X=X/2;
           K=X/2;
		}while(1<X);
		System.out.print(ans); 	
			

	}
}




