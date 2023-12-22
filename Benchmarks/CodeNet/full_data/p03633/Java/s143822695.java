
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

 Scanner in = new Scanner(System.in);
 int N = in.nextInt();
 long input = 0;
 long n2 = 0;
 long n21 = 0;

 for(int cnt = 0; cnt < N; cnt++){
	 input = in.nextLong();
	 if(input % 2 == 0){
		 if(input > n2){
		     n2 = input;
		  }
	 }
	 else{
		 if(input > n21){
			 n21 = input;
		 }
	 }
 }
 if(n2 < n21){
	 System.out.println(lcm(n2,n21));
 }
 else{
	 System.out.println(lcm(n21,n2));
 }
 in.close();
}

private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}

private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}

}
