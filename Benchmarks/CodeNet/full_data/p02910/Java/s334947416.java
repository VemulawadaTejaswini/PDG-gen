import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans = "";
    for(int i=0;i<S.length();i++){
      String Step = S.substring(i,i+1);
      if (i%2==0){
        if ((Step.equals("R")) || (Step.equals("U")) || (Step.equals("D"))){
          ans = "Yes";
        }else{
          ans = "No"; break;
        }
      }else{
        if ((Step.equals("L")) || (Step.equals("U")) || (Step.equals("D"))){
          ans = "Yes";
        }else{
          ans = "No"; break;
        }
      }
    }
    System.out.println(ans);
  }
}