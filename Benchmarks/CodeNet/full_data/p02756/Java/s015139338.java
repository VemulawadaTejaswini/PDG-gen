import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int q = sc.nextInt();
    int t = 0;
    for(int i = 0;i< q;i++){
      t = sc.nextInt();
      if(t == 1){
        StringBuffer tt = new StringBuffer(s);
        s = tt.reverse().toString();
      }else{
        t = sc.nextInt();
        String ss = sc.next();
        if(t == 1){
          s = ss + s;
        }else{
          s = s + ss;
        }
      }
    }
    System.out.println(s);
  }
}
