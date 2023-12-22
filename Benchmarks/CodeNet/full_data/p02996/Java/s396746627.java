import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[][] time = new long[n][2];
      for(int i = 0;i < n;i++){
      	time[i][0]=sc.nextLong();
        time[i][1]=sc.nextLong();
      }
      Arrays.sort(time,(a,b)->Integer.compare((int)a[1],(int)b[1]));
      long sum = 0;
      for(int i = 0;i < n;i++){
      	sum+=time[i][0];
        if(sum>time[i][1]){
        	System.out.println("No");
            return;
        }
      }
      System.out.println("Yes");
    }
}