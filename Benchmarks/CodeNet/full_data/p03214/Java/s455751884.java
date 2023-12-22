import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
      int[] a = new int[N];
      int sum=0;
      for(int i=0;i<N;i++){
       a[i] = sc.nextInt();
       sum+=a[i];
      }
      double ave = sum/N;
      double min =100;
      int ans = 0;
      for(int i=0;i<N;i++){
        double d = Math.abs((double)a[i]-ave);
        if(d<min){
          min=Math.min(d,min);
          ans=i;
        }
      }
      	System.out.println(ans);
    }
}