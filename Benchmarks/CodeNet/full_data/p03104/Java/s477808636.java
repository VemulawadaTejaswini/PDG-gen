import java.util.Scanner;

class Main {
  
  public static long culc(long x) {
    long cntl = (x + 1) / 2;
    long ans = cntl % 2;
    if(x % 2 == 0) ans ^= 1;
    return ans;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long ans = culc(a-1)^culc(b);
    System.out.println(ans);
  }

}
