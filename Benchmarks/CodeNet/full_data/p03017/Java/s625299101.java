import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int a  = sc.nextInt()-1;
    int b  = sc.nextInt()-1;
    int c  = sc.nextInt()-1;
    int d  = sc.nextInt()-1;
    String S  = sc.next();
    char[] s = S.toCharArray();
    
    for(int i = 1; i < n; i++){
        if(s[i] == '#' && s[i-1] == '#'){
          System.out.println("No");
          return;
        }
    }
   
    if(s[c] == '#' || s[d] == '#'){
      System.out.println("No");
      return;
    }
    if(c < d){
      System.out.println("Yes");
      return;
    }else{
      String tmp = S.substring(b-1,d+2);//ふぬけが動く範囲
        if(tmp.contains("...")){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }   
  }
}