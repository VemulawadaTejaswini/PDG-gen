import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long t1 = sc.nextLong();
    long t2 = sc.nextLong();
    long a1 = sc.nextLong();
    long a2 = sc.nextLong();
    long b1 = sc.nextLong();
    long b2 = sc.nextLong();
    if(a1*t1+a2*t2==b1*t1+b2*t2)System.out.println("infinity");
    else if((a1>b1&&a2>b2)||(a1<b1&&a2<b2))System.out.println(0);
    else if(a1>=b1&&a2<=b2){
      long d = (a2-b2)*t2+(a1-b1)*t1;
      if(d>0)System.out.println(0);
      else if(d<0){
        if((b1*t1-a1*t1)%d!=0)System.out.println(((b1*t1-a1*t1)/d)*2+1);
        else System.out.println(((b1*t1-a1*t1)/d)*2);
      }
    }
    else if(a1<=b1&&a2>=b2){
      long d = (b2-a2)*t2+(b1-a1)*t1;
      if(d>0)System.out.println(0);
      else if(d<0){
        if((a1*t1-b1*t1)%d!=0)System.out.println(((a1*t1-b1*t1)/d)*2+1);
        else System.out.println(((a1*t1-b1*t1)/d)*2);
      }
    }
  }
}