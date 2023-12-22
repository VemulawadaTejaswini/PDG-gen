
import java.util.*; 
public class Main {
    public static void main(String[] args)  {
      Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int [] arr = new int[n];
           int sum=0;
           for (int i =0;i<n;i++) {
        	   int num = in.nextInt();
        	   arr[i] = num;
        	   sum+=num;}
           int chosen = (int) Math.ceil((double)sum/n);
           //System.out.println(chosen);
           int cost=0;
           for (int i = 0;i<arr.length;i++) {
        	   cost += Math.pow((arr[i]-chosen), 2);}
           System.out.println(cost);
    }
 
}