import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();
    if(k<=a){
      System.out.print(a-k);
      System.out.print(" ");
      System.out.println(b);
    }else if(a+b<=k){
      System.out.println("0 0");
    }else{
      System.out.print("0 ");
      System.out.println(b-k+a);
    }

  }
  

  
}
