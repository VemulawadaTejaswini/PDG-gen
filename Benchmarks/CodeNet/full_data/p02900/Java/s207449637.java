import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    
    Set<Long> set = new HashSet<>();
    long a = (long)Math.sqrt(A);
    for(long i = 2; i <= A && i <= a; i++){
      boolean c = false;
      while(A%i==0){
        A /= i;
        c = true;
      }
      
      if(c){
        set.add(i);
      }
    }
    
    int ans = 1;
    long b = (long)Math.sqrt(B);
    for(long i = 2; i <= B && i <= b; i++){
      boolean c = false;
      while(B%i==0){
        B /= i;
        c = true;
      }
      
      int size = set.size();
      if(c){
        set.add(i);
        if(size == set.size()){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}