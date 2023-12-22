import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A,P,ans;
    A = sc.nextInt();
    P = sc.nextInt();
    ans = ((A+(P%2))*(3/2))+(P/2);
    System.out.println(ans);
  }
}
