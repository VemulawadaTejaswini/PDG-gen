import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
      int[] A=new int[b];
      int[] B=new int[b];
      int koubaisuu=1;
        for(int i=0;i<A.length;i++){
          int c=sc.nextInt();
          A[i]=c;
            koubaisuu=lcm(koubaisuu,c);
        }
      for(int i=0;i<A.length;i++){
        B[i]=koubaisuu/A[i];
        }
      int wa=0;
      for(int i=0;i<B.length;i++){
        wa+=B[i];
      }
      System.out.println((int)(wa%(Math.pow(10,9)+7)));
	}
  private static int lcm(int m, int n) {
    return m * n / gcd(m, n);
}
  private static int gcd(int m, int n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}