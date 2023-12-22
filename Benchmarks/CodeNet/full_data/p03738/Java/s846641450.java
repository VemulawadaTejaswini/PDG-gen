import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    
    if(B.compareTo(A)<0){
      System.out.println("GREATER");
    }else if(B.compareTo(A)>0){
      System.out.println("LESS");
    }else if(A.compareTo(B)==0){
      System.out.println("EQUAL");
    }
  }
}   