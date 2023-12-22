import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    String AS = S.substring(0,A);
    String haihun = S.substring(A,A+1);
    String BS = S.substring(A+1,A+B+1);

    if(!isNumber(AS)||!isNumber(BS)){
      System.out.println("No");
      return;
    }
    if(!haihun.equals("-")){
      System.out.println("No");
      return;
    }
    
    System.out.println("Yes");
    
  }
  

  public static boolean isNumber(String num) {
    try {
        Integer.parseInt(num);
        return true;
        } catch (NumberFormatException e) {
        return false;
    }
}
}