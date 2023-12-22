import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    long a=sc.nextLong();
    long b=sc.nextLong();
    long x=sc.nextLong();
    sc.close();
    b=b/x*x;
    if(a%x>0){
      a=(a/x+1)*x;
    }
    System.out.println((b-a)/x+1);
  }
}