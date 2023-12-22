import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String S = sc.next();
    String T = sc.next();
    for(int i = 0; i < n; i++){
      System.out.print(S.charAt(i)+""+T.charAt(i));
    }
    System.out.println();
  }
}