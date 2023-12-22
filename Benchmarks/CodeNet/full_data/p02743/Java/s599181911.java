import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=Math.sqrt(sc.nextInt());
    double b=Math.sqrt(sc.nextInt());
    double c=Math.sqrt(sc.nextInt());
    if(a+b<c){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}