import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int X = 0;
    while(B > 0){
      X += 1;
      B -= A;
    }
    System.out.println(X);
  }
}