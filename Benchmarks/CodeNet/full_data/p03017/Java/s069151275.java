import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static final int EMPTY = 0;
  static final int ROCK = -1;
  static final int A = 1;
  static final int B = 2;

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next()) - 1;
    int b = Integer.parseInt(sc.next()) - 1;
    int c = Integer.parseInt(sc.next()) - 1;
    int d = Integer.parseInt(sc.next()) - 1;
    String input = sc.next();
    int[] line = new int[n];
    IntStream.range(0, n).forEach(i -> {
      line[i] = resolve(String.valueOf(input.charAt(i)));
    });
    int currentA = a;
    int currentB = b;
    line[a] = A;
    line[b] = B;
    while (true) {
      if (c < d) { // b is primary
        int movedB = tryMovePrimary(B, currentB, d, line, n);
        int movedA;
        if (movedB == d) {
          movedA = tryMovePrimary(A, currentA, c, line, n);
        } else {
          movedA = tryMoveSecondary(A, currentA, c, line, n, movedB);
        }
        if (movedA == c && movedB == d) {
          pw.println("Yes");
          return;
        }
        if (movedA == currentA && movedB == currentB) {
          pw.println("No");
          return;
        }
        currentA = movedA;
        currentB = movedB;
      } else {
        int movedA = tryMovePrimary(A, currentA, c, line, n);
        int movedB;
        if (movedA == c) {
          movedB = tryMovePrimary(B, currentB, d, line, n);
        } else {
          movedB = tryMoveSecondary(B, currentB, d, line, n, movedA);
        }
        if (movedA == c && movedB == d) {
          pw.println("Yes");
          return;
        }
        if (movedA == currentA && movedB == currentB) {
          pw.println("No");
          return;
        }
        currentA = movedA;
        currentB = movedB;
      }
    }
  }

  static void debug(int line[], int n) {
    System.out.println(
      IntStream.range(0, n).map(i -> line[i]).mapToObj(i -> {
        switch (i) {
          case -1:
            return "#";
          case 0:
            return ".";
          case 1:
            return "A";
          case 2:
            return "B";
          default:
            throw new RuntimeException(String.valueOf(i));
        }
      }).collect(Collectors.joining()));
  }

  static int tryMovePrimary(int target, int currentPosition, int goal, int[] line, int n) {
    int movedPosition = currentPosition;
    for (int i = currentPosition; i < n; i++) {
      if (i == goal || i + 1 == goal || i + 2 == goal) {
        movedPosition = goal;
        break;
      }
      if (line[i + 1] != EMPTY && line[i + 2] != EMPTY) {
        break;
      }
      if (line[i + 2] == EMPTY) {
        movedPosition = i + 2;
        i = i + 1;
        continue;
      }
      if (line[i + 1] == EMPTY) {
        movedPosition = i + 1;
        continue;
      }
    }
    line[currentPosition] = EMPTY;
    line[movedPosition] = target;
    return movedPosition;
  }

  static int tryMoveSecondary(int target, int currentPosition, int goal, int[] line, int n,
    int primaryPosition) {
    int movedPosition = currentPosition;
    for (int i = currentPosition; i < n; i++) {
      if (i == goal) {
        movedPosition = i;
        break;
      }
      if (line[i + 1] != EMPTY && line[i + 2] != EMPTY) {
        break;
      }
      if (line[i + 2] == EMPTY) {
        if (line[i + 3] == EMPTY) {
          movedPosition = i + 2;
          i = i + 1;
          continue;
        }
        if (line[i + 1] == EMPTY) {
          movedPosition = i + 1;
          continue;
        }
      }
      if (i > primaryPosition) {
        if (line[i - 1] == EMPTY && line[i + 1] == EMPTY) {
          movedPosition = i;
          break;
        }
      }
    }
    line[currentPosition] = EMPTY;
    line[movedPosition] = target;
    return movedPosition;
  }

  static int resolve(String s) {
    if (s.equals(".")) {
      return EMPTY;
    } else if (s.equals("#")) {
      return ROCK;
    } else {
      throw new RuntimeException(s);
    }
  }

}
