import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w[] = new int[n];
    int s[] = new int[n+1];
    s[0] = 0;
    int d[] = new int[n];
    for(int i=0;i<n;i++){
      w[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){      
      s[i+1]=w[i]+s[i];
    }
    for(int i=0;i<n;i++){
      d[i]=Math.abs((s[n]-s[i])-s[i]);
    }   
    Arrays.sort(d);
    System.out.println(d[0]);
    
  }
}