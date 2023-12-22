import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    String s=a+b;
    final int S=Integer.parseInt(s);
    double d=Math.sqrt(S);
    int i=(int)d;
    if(i*i==S){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}