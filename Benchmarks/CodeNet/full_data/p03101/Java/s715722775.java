import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int d = s.nextInt();

    int e = a-c;
    int f = b-d;
    System.out.println(e*f);
  }
}
