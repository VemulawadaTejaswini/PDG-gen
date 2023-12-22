import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] x = new int[n];
      for(int i = 0;i < n;i++){
        x[i]=sc.nextInt();
      }
      
      int min = 1000000000;
      for(int i = 0;i <= n-k;i++){
      	int r = x[i+k-1];
        int l = x[i];
        min = Math.min(min, Math.min(Math.abs(r-l)+Math.abs(r), Math.abs(r-l)+Math.abs(l)));
      }
      System.out.println(min);
    }
}