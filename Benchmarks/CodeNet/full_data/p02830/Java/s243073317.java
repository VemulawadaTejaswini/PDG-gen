import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    String S = sc.next(); 
    String T = sc.next();
    String[] Sa = S.split("");
    String[] Ta = T.split("");
    String ans = "";
    for (int i=0;i<N;i++){
      ans = ans + Sa[i] + Ta[i];
    }
    System.out.println(ans);
  }
}
