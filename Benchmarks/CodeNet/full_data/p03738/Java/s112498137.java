import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();
    String B = sc.nextLine();
    
    String[] s = new String[2];
    s[0] = A;
    s[1] = B;
    
    Arrays.sort(s);
    String ans = "";
    if(A.equals(B)){
      ans = "EQUAL";
    }else if(A.equals(s[0])){
      ans = "LESS";
    }else{
      ans = "GREATER";
    }
    
    System.out.println(ans);
  }
}