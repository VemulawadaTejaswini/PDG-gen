import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int[] w = new int[n+1];
    int[] b = new int[n+1];
    for(int i = 1;i <= n;i++){
      if(s.charAt(i-1)=='.'){
        w[i]=w[i-1]+1;
        b[i]=b[i-1];
      }else{
        w[i]=w[i-1];
        b[i]=b[i-1]+1;
      }
    }
    int min = 0;
    for(int i = 0;i <= n;i++){
      min = Math.min(min,b[i]+w[n]-w[i]);
    }
    System.out.println(min);
  }
}
