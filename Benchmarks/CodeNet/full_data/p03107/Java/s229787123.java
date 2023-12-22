import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    final String input = scanner.next();
    final int count0 = countChar(input, '0');
    final int count1 = countChar(input, '1');
    System.out.println(input.length() - Math.abs(count0 - count1));
  }
  private static int countChar(String str, char target){
    return str.length() - str.replace(String.valueOf(target), "").length();
  }
}