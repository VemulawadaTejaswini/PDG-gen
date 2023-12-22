import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    long a = stdIn.nextLong(), b = stdIn.nextLong(), c = stdIn.nextLong();
    long k = stdIn.nextLong();

    for(int i = 0; i < k; i++) {
      long tmp = a;
      a = b + c;
      b = tmp + c;
      if(a - b > (int) Math.pow(10, 18)) {
        System.out.println("Unfair");
        break;
      }
    }

    System.out.println(a - b);
  }
}
