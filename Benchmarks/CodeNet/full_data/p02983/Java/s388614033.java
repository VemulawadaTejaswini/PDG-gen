import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    long L = sc.nextInt();
    long R = sc.nextInt();
    sc.close();
    
    long result = 2018;

    for (long i = L; i < R; i++) {

      long a = (i * (i + 1)) % 2019;

      long b = (2019 - a) / i;

      if (i + b <= R) {
        a = (i * b) % 2019;
      }

      if (a < result){
        result = a;
      }

    }

    System.out.println(result);

  }
  
}