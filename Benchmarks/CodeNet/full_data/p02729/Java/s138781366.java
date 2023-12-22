import java.util.*;

public class Main
{
    static long factorial(long n) {
   long fact = 1;
   long i = 1;
   while(i <= n) {
      fact *= i;
      i++;
   }
   return fact;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n=s.nextInt();
		long m=s.nextInt();
		long comb1,comb2,comb;
		
		comb1 = factorial(n) / (factorial(2) * factorial(n-2));
		comb2 = factorial(m) / (factorial(2) * factorial(m-2));
		comb=comb1+comb2;
		System.out.println(""+comb);
	}
}
