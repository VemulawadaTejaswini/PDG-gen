import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String S1 = S.substring(0,1);
    String S2 = S.substring(1,2);
    String S3 = S.substring(2,3);
    String S4 = S.substring(3,4);
    if(S1.equals(S2) || S2.equals(S3) || S3.equals(S4)){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }
  }
}