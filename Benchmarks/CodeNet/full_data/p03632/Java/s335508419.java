import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int count =0;
    boolean[] alice = new boolean[101];
    boolean[] bob = new boolean[101];
    for (int i=0; i<=100; i++) {
      if(i >= A && i <= B) alice[i] = true;
      if(i >= C && i <= D) bob[i] = true;
      if(alice[i] == true && bob[i] == true) count++;
    }
    if (count != 0) {
      System.out.println(count-1);
    } else {
      System.out.println(count);
    }
  }
}