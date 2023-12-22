import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    int ans = 0;
    if((B-A)%2 == 0) {
    	ans += (B-A)/2;
    }else {
    	int r = Math.min(N-B, A-1);
    	ans += r;
    	if(r == A-1) {
    		B -= r;
    		ans += B-1;
    	}else {
    		A += r;
    		ans += N-A;
    	}
    }
    System.out.println(ans);
  }
}