import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long P = 1;
    for ( int i = 1; i <= N ; i++) {
       P = P * i;
       P = P % 1000000007; 
   }
    System.out.println(P);
  }
}