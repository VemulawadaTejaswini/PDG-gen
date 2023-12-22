import java.util.*;
 
public class Main{
  public static int[] dp;
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    String s1 = S.substring(0,2);
    String s2 = S.substring(2,4);
    int n1 = Integer.parseInt(s1);
    int n2 = Integer.parseInt(s2);

    String ans = "";
    
    if(n1 <= 12 && n2 <= 12 && n1 > 0 && n2 > 0){
      ans = "AMBIGUOUS";
    }else if(n1 <= 12 && n1 > 0){
      ans = "MMYY";
    }else if(n2 <= 12 && n2 > 0){
      ans = "YYMM";
    }else{
      ans = "NA";
    }
   System.out.println(ans);
  }
}