import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    long [] A = new long[N];
    long sum = 0;
    for(int i = 0; i < N; i++) {
    	A[i] = sc.nextLong();
    	if(A[i] < 0) cnt++;
    	sum += Math.abs(A[i]);
    }
    long ans = 0;
    if(cnt % 2 == 0) ans = sum;
    else {
    	Arrays.sort(A);
    	sum -= A[0];
    	ans = sum;
    }
    System.out.println(ans);
  }
}