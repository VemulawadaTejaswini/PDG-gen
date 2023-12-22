import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ans = sc.next();
    int Q = sc.nextInt();
    
    //操作
    while(sc.hasNext()){
      int T = sc.nextInt();
      if(T == 1){
        StringBuffer sb = new StringBuffer(ans);
        ans = sb.reverse().toString();
      }else if(T == 2){
        int F = sc.nextInt();
        if(F == 1){
          ans = sc.next() + ans;
        }else if(F == 2){
          ans = ans + sc.next();
        }
      }
    }
    
    System.out.println(ans);
    
  }
}