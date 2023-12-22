import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
  if(K%2==0){
    System.out.println(K*K/4);
  }else{
    System.out.println((K+1)*(K-1)/4);
  }
  }
}
