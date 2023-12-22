import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.next().split("");
    if(s.length==2){
      System.out.print(s[0]);
      System.out.print(s[1]);
    }else{
      System.out.print(s[2]);
      System.out.print(s[1]);
      System.out.print(s[0]);
    }   
  } 
}