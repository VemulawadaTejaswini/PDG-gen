import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int d[]= new int[N];
    int sum = 0;
    
    for(int i = 0; i<N; i++){
      d[i]=sc.nextInt();
      sum += d[i];
    }
    
    int ans = 0;
    for(int i = 0; i<N; i++){
      ans += d[i]*(sum-d[i]);
    }
    
    System.out.println(ans/2);
  }
}