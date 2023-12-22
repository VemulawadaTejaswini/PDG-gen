import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    long[] freq = new long[26];
    for (char ch : S) {
      freq[ch - 'A']++;
    }
    long count = freq['R' - 'A'] * freq['G' - 'A'] * freq['B' - 'A'];
    for (int i = 1; i < N; i++) {
      for (int j = 0; j + 2 * i < N; j++) {
        if (S[j] != S[j + i] && S[j + i] != S[j + i * 2] && S[j] != S[j + i * 2]) count--;
      }
    }
    System.out.println(count);
  }
}
