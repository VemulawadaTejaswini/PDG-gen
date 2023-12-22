import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long start = scanner.nextLong();
    long end = scanner.nextLong();
    
    int result = 0;
    for (int ix = start; ix <= end; ix++) {
      result ^= ix;
    }
    
    System.out.println(result);
  }
}
