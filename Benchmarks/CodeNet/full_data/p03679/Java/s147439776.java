import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    if(a>=b){
      System.out.println("delicious");
    }else if((b-a)>x){
      System.out.println("dangerous");
    }else{
      System.out.println("safe");
    }

  }
  

  
}
