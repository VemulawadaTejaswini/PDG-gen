import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int target = sc.nextInt();
    String s = Integer.toString(target);
    char[] chars = s.toCharArray();
    
    int result = 0;
    if (chars[0] == '1') {
      result++;
    }
    if (chars[1] == '1') {
      result++;
    }
    if (chars[2] == '1') {
      result++;
    }
    System.out.println(result);
  }
}