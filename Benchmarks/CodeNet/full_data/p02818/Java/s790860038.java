import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong(), B = sc.nextLong(), K = sc.nextLong();
    if(A-K < 0){
      A = 0; 
      B = B-K < 0 ? 0 : K-B;
    }else{
      A = K-A;
    }
    System.out.println(A+" "+B);
  }
}