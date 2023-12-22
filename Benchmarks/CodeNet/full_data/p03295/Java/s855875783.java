import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Section[] sections = new Section[M];
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      sections[i] = new Section(a, b);
    }
    Arrays.sort(sections, Comparator.comparingInt(section -> section.end));

    int cnt = 0;
    int right = 0;
    for (Section sec : sections) {
      if (sec.start >= right) {
        cnt++;
        right = sec.end;
      }
    }
    System.out.println(cnt);
  }

  private static class Section {
    private final int start;
    private final int end;

    private Section(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }
}
