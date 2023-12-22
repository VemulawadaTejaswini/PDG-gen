import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long area;
    int i;
    area = Long.parseLong(sc.next());
    for(i = 2; i <= 1000000000; i++) {
      if(area % i == 0) break;
    }
    System.out.println("0 0 " + area/2 + " 0 0 " + i);
  }
}
