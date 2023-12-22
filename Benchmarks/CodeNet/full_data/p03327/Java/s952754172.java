import java.util.*;
public class Main{
  public static main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n < 1000){
      System.out.println("ABC"+n);
    }else{
      System.out.println("ABD"+(n-999));
    }
  }
}
