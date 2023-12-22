import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c=Math.max(a,b);
    long d=Math.min(a,b);
    if(d==1){
      if(c==1){
        System.out.println(1);
      }else{
        System.out.println(a*b-2);
      }
    }else{
      System.out.println(a*b-(c+d-2)*2);
    }
  }
}