import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2==0){
      float x=n/2;
      System.out.println(x);
      float a=x/n;
      System.out.println(a);
    }else{
      float y=n/2+1;
      System.out.println(y);
      float b=y/n;
      System.out.println(b);
    }
  }
}
