import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = new int[3];
    for (int i = 0; i < 3; i++) {
      n[i] = sc.nextInt();
    }
    Arrays.sort(n);
    int total = 0;
	total += n[2] - n[1];
    total += n[1] - n[0];
    System.out.println(total);
  }
}