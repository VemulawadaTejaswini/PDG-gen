import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=sc.nextLong();
    /*
    sqrt(a)+sqrt(b)<sqrt(c)
    a+b+2*sqrt(a*b)<c
    2*sqrt(a*b)<c-a-b
    
    4*a*b<(c-a-b)^2 (c-a-b)>0
    */
    if(c<=a+b){
      System.out.println("No");
    }else if(4*a*b<(c-a-b)*(c-a-b)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}