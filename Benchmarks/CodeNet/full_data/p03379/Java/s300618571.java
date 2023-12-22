import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] x = new int[n];
      int[] y = new int[n];
      for(int i = 0;i < n;i++){
        x[i]=sc.nextInt();
        y[i]=x[i];
      }
      Arrays.sort(x);
      for(int i = 0;i < n;i++){
      	if(y[i]<=x[n/2-1])System.out.println(x[n/2]);
        else System.out.println(x[n/2-1]);
      }
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}