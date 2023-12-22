import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] A = scanner.next().toCharArray();
    char[] B = scanner.next().toCharArray();
    int result = compare(A, B);
    if (result < 0) System.out.println("LESS");
    else if (result > 0) System.out.println("GREATER");
    else System.out.println("EQUAL");
  }

  private static int compare(char[] A, char[] B) {
    if (A.length != B.length) {
      if (A.length < B.length) return -1;
      else return 1;
    }
    for (int i = 0; i < A.length; i++) {
      if (A[i] < B[i]) return -1;
      else if (A[i] > B[i]) return 1;
    }
    return 0;
  }
}
