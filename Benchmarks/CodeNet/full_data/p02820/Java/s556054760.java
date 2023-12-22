import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int r = scanner.nextInt();
    int s = scanner.nextInt();
    int p = scanner.nextInt();
    String t = scanner.next();
    char[] ts = t.toCharArray();
    int point = 0;

    for (int i = 0; i < k; i++) {
      char prev = '-';
      for (int j = 0; i + j * k < ts.length; j++) {
        if (ts[i + j * k] == 'r') {
          if (prev != 'p') {
            point += p;
            prev = 'p';
          } else {
            int nextIndex = i + j * k + k;
            if (nextIndex < ts.length) {
              if (ts[nextIndex] == 'r') {
                prev = 'r';
              } else if (ts[nextIndex] == 's') {
                prev = 's';
              } else {
                prev = 'r';
              }
            }
          }
        } else if (ts[i + j * k] == 'p') {
          if (prev != 's') {
            point += s;
            prev = 's';
          } else {
            if (i + j * k + k < ts.length) {
              if (ts[i + j * k + k] == 'r') {
                prev = 'r';
              } else if (ts[i + j * k + k] == 's') {
                prev = 'p';
              } else {
                prev = 'p';
              }
            }
          }
        } else {
          if (prev != 'r') {
            point += r;
            prev = 'r';
          } else {
            if (i + j * k + k < ts.length) {
              if (ts[i + j * k + k] == 'r') {
                prev = 's';
              } else if (ts[i + j * k + k] == 's') {
                prev = 's';
              } else {
                prev = 'p';
              }
            }
          }
        }
      }
    }
    System.out.println(point);
  }
}
