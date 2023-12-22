import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    double W = (double)Integer.parseInt(S[0]);
    double H = (double)Integer.parseInt(S[1]);
    double x = (double)Integer.parseInt(S[2]);
    double y = (double)Integer.parseInt(S[3]);
    
    double s1 = Math.min(W*y, W*(H-y));
    double s2 = Math.min(H*x, H*(W-x));
    
    int check = 0;
    if(W==H && W/2==x && H/2==y){
      check = 1;
    }
    
    System.out.print(Math.max(s1, s2));
    System.out.print(" ");
    System.out.println(check);
  }
}
