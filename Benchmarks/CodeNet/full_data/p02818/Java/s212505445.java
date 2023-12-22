import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int k = scan.nextInt();
    if(a >= k){
      int x = a-k;
      System.out.println(x + " " + b);
    }else{
      int x = a+b-k;
      System.out.println(0 + " " + x);
    }
  }
}
