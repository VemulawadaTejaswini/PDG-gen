import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long s=sc.nextLong();
    long a,b,c;
    a=s/500;
    b=(s%500)/5;
    c=a*1000+b*5;
    System.out.print(c);
  }
}