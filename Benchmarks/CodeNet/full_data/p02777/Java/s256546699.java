import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.nextLine();

    int A = sc.nextInt();
    int B = sc.nextInt();

    String U = sc.next();

    if(S == U){
      A -= 1;
      System.out.println(A + " " + B);
    }else{
      B -= 1;
      System.out.println(A + " " + B);
    }
    
}
}
