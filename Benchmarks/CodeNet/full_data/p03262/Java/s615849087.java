import java.util.*;

public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    long X = Long.parseLong(sc.next());
    
    long[] x = new long[N];
    
    for(int i = 0; i < N; i++){
      x[i] = Long.parseLong(sc.next());
    }
    
    long diff = Long.MAX_VALUE;
    
    for(int i = 0; i < N; i++){
      long j = x[i];
      
      if(Math.abs(j-X) < diff){
        diff=Math.abs(j-X);
      }
    }
    System.out.println(diff);
  }
}