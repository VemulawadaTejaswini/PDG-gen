import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    if (possible(s.toCharArray(), 0)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  private static boolean possible(char[] str, int index) {
    if (index == str.length) return true;
    if (compare(str, index, "dreamer".toCharArray())) {
      return possible(str, index + 5) || possible(str, index + 7);
    }
    if (compare(str, index, "eraser".toCharArray())) return possible(str, index + 6);
    if (compare(str, index, "dream".toCharArray()) || compare(str, index, "erase".toCharArray())) return possible(str, index + 5);
    return false;
  }

  private static boolean compare(char[] str, int index, char[] target) {
    int i = 0;
    while (i < target.length && index + i < str.length && str[index + i] == target[i]) i++;
    return i == target.length;
  }
}
