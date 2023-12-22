import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long sum = 0;
    long even = 0;
    long[] water = new long[n];
    long[] mountain = new long[n];
    for(int i = 0; i < n; i++) {
      water[i] = Long.parseLong(sc.next());
      sum += water[i];
      if(i % 2 == 1) even += water[i];
    }
    mountain[0] = sum - 2 * even;
    StringBuilder sb = new StringBuilder();
    sb.append(mountain[0]);
    for(int i = 1; i < n; i++) {
      mountain[i] = 2 * water[i-1] - mountain[i-1];
      sb.append(" " + mountain[i]);
    }
    System.out.println(sb.toString());
  }
}
