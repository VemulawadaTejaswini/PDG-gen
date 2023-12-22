import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A,P,ans;
    A = sc.nextInt();
    P = sc.nextInt();
    A*=3;
    A+=(P%2);
    ans = (A/2)+(P/2);
    System.out.println(ans);
  }
}
