import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.close();

    String Nstr = String.valueOf(N);

    if(Nstr.charAt(0)-'0' == 7 || Nstr.charAt(1)-'0' == 7 || Nstr.charAt(2)-'0' == 7) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}