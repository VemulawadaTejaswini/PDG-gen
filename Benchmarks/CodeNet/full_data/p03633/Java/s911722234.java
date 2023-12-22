import java.util.Scanner;

public class Main {

public static void main(String[] args) {

 Scanner in = new Scanner(System.in);
 int N = in.nextInt();
 long tmp = 0;
 long ans = 0;

 for(int cnt = 0; cnt < N; cnt++){
	 tmp = in.nextLong();
	 if(ans != 0){
		 tmp = lcm(ans,tmp);
	 }
	 ans = tmp;
 }


 System.out.println(tmp);

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

