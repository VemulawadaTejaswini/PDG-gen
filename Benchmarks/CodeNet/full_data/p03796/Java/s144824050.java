import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int  n     = sc.nextInt();
    long power = 1;

    for (int i = 1; i <= n; i++) {
      
      power *= i;

    }

    System.out.println(power % (1000000000l + 7l));
    
  }

}
