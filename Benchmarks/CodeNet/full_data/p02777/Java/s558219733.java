import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    String T = sc.next();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String U = sc.next();

    if(S==U){
        System.out.print(A-1);
        System.out.print(" ");
        System.out.println(B);
    }else{
        System.out.print(A);
        System.out.print(" ");
        System.out.println(B-1);
    }

    }    
}
