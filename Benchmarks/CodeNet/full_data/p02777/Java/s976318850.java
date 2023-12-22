import java.util.*;
import static java.lang.System.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int A= sc.nextInt();
    int B= sc.nextInt();
    String U = sc.next();
    if(U.equals(S)){
      A-=1;
    }
    if(U.equals(T)){
      B-=1;
    }
    out.print(A+" "+B);
  }




  }

