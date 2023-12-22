import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    float W = (float)Integer.parseInt(S[0]);
    float H = (float)Integer.parseInt(S[1]);
    float x = (float)Integer.parseInt(S[2]);
    float y = (float)Integer.parseInt(S[3]);
    
    float s1 = Math.min(W*y, W*(H-y));
    float s2 = Math.min(H*x, H*(W-x));
    
    System.out.print(Math.max(s1, s2));
    System.out.print(" ");
    System.out.println(s1==s2 ? 1 : 0);
  }
}
