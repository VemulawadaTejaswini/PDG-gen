import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();
    String B = sc.nextLine();
    
    String ans = "";
    if(A.equals(B)){
      ans = "EQUAL";
    }else if(A.length() > B.length()){
      ans = "GREATER";
    }else if(A.length() < B.length()){
      ans = "LESS";
    }else{
      for(int i = 0; i < A.length(); i++){
        char a = A.charAt(i);
        char b = B.charAt(i);
        if(a > b){
          ans = "GREATER";
          break;
        }else if(a < b){
          ans = "LESS";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}