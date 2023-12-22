import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt(),
        n = sc.nextInt();
    if(d == 0)
      System.out.println(n);
    else
      System.out.printf("100E%d * %d\n", d, n);
  }
}