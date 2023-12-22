import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String M =sc.next();
    if(M.contains("AB")){System.out.println("Yes");}
    else if(M.contains("BA")){System.out.println("Yes");}
            else{System.out.println("No");}
  }
}
