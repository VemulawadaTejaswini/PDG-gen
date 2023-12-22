import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] nums = Stream.of(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    long w = nums[0];
    long h = nums[1];
    long x = nums[2];
    long y = nums[3];
    long max = w * h / 2L;
    boolean isMulti = x * 2 == w && y * 2 == h;
    StringBuilder sb = new StringBuilder();
    sb.append(max);
    sb.append(" ");
    sb.append(isMulti ? 1 : 0);
    System.out.print(sb.toString());
  }
}