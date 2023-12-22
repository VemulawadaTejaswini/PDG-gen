import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    StringBuffer sb = new StringBuffer(S);
    int Q = Integer.parseInt(sc.next());
    int T, F;
    String C;
    boolean rev = false;
    for(int i=0; i<Q; i++){
      T = Integer.parseInt(sc.next());
      if(T==1){
        if(rev)rev=false;
        else rev=true;
      } else if(T==2){
        F = Integer.parseInt(sc.next());
        C = sc.next();
        if(F==1){
          if(rev) sb.append(C);
          else sb.insert(0,C);
        } else if(F==2){
          if(rev) sb.insert(0,C);
          else sb.append(C);
        }
      }
    }
    if(rev)sb.reverse();
    System.out.println(sb);
  }
}