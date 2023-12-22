import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    long T = 0;

    T = N%K;
    long ans = Math.min(T , K - T);

    System.out.println(ans);

}
}
