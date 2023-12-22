import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
		int k = sc.nextInt();
        double ans = Math.max(0,n-k+0.0/n);
        for(int i=1;i<=Math.min(n,k-1);i++){
          double ans2 = 1.0/n;
          int point = i;
          while(point<k){ans2/=2.0;point*=2;}
          ans+=ans2;}        
	    System.out.println(ans);
  }
}