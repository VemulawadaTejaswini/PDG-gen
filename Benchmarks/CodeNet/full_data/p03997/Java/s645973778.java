import java.util.*;
public class ABC045A{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int h=sc.nextInt();
    sc.close();
    int s=(a+b)*h/2;
    System.out.println(s);
  }
}