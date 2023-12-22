import java.util.*;
public class Main{
  public static void main(String arg[]){
    Scanner stdIn = new Scanner(System.in);
    String text = stdIn.next();
    String s[] = text.split("");
    
    boolean flag = false;
    int i = 0;
    int ansA = 0;
    int ansB = 0;
    while(i < s.length-1){
      if(s[i].equals("#")){
        ansA++;
        flag = true;
      }
      if(flag){
        if(s[i+1].equals(".")){
          ansB++;
        }
      }
      i++;
    }

    int ans;
    if(ansA < ansB) ans = ansA;
    else ans = ansB;
    System.out.println(ans);
  }
}