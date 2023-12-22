import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();

      if((A-(2*B) < 0))
          System.out.print(0);
      else
          System.out.print(A-(2*B));

    }
}