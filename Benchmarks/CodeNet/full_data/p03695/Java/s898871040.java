import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    HashSet<Color> colors = new HashSet<>();
    int numNull = 0;
    int N = scanner.nextInt();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      Color c = Color.fromScore(a);
      if (c != null) colors.add(c);
      else numNull++;
    }

    int min = Math.max(colors.size(), 1);
    int max = colors.size() + numNull;
    System.out.printf("%d %d\n", min, max);
  }

  private enum Color {
    GRAY, BROWN, GREEN, LIGHT_BLUE, BLUE, YELLOW, ORANGE, RED;

    static Color fromScore(int score) {
      if (score < 400) return GRAY;
      if (score < 800) return BROWN;
      if (score < 1200) return GREEN;
      if (score < 1600) return LIGHT_BLUE;
      if (score < 2000) return BLUE;
      if (score < 2400) return YELLOW;
      if (score < 2800) return ORANGE;
      if (score < 3200) return RED;
      return null;
    }
  }
}
