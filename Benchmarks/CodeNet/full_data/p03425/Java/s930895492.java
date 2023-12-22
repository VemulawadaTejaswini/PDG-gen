import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] captoi = new int[26];
    for (int i = 0; i < 26; i++) captoi[i] = -1;
    int id = 0;
    for (char c : new char[] {'M', 'A', 'R', 'C', 'H'}) captoi[c - 'A'] = id++;
    long[] capCount = new long[5];
    for (int i = 0; i < N; i++) {
      int c = scanner.next().charAt(0) - 'A';
      if (captoi[c] >= 0) capCount[captoi[c]]++;
    }

    long count = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = i + 1; j < 4; j++) {
        for (int k = j + 1; k < 5; k++) {
          count += capCount[i] * capCount[j] * capCount[k];
        }
      }
    }
    System.out.println(count);
  }
}
