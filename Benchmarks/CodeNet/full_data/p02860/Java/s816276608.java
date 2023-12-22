import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    if(N%2 == 1){
      System.out.println("No");
      return;
    }
    
    String S1 = S.substring(0,N/2);
    String S2 = S.substring(N/2, N);
    if(S1.equals(S2)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}