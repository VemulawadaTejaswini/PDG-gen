import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
		int k = sc.nextInt();
        double ans = 0;
        for(int i=1;i<=n;i++){
          int count = n;
          int point = i;
          while(point<k){count*=2;point*=2;}
          double ans2 = 1.0/count;ans+=ans2;}        
	    System.out.println(ans);
  }
}