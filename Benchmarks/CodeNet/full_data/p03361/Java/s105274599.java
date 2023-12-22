import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int h = stdIn.nextInt();
    int w = stdIn.nextInt();

    String[] s = new String[h];
    for (int i = 0; i < h; i++) {
      s[i] = stdIn.next();
    }

    boolean answer = true;

    if (h == 1 && w == 1) {
      if (s[0].charAt(0) == '#') answer = false;
    } else if (h == 1 && w != 1) {
      if (s[0].charAt(0) == '#') {
        if (s[0].charAt(1) == '.') answer = false;
      }
      if (s[0].charAt(w-1) == '#') {
        if (s[0].charAt(w-2) == '.') answer = false;
      }

      for (int i = 1; i < w-1; i++) {
        if (s[0].charAt(i) == '#') {
          if (s[0].charAt(i-1) == '.' && s[0].charAt(i+1) == '.') answer = false;
        }
      }
    } else if (h != 1 && w == 1) {
      if (s[0].charAt(0) == '#') {
        if (s[1].charAt(0) == '.') answer = false;
      }
      if (s[h-1].charAt(0) == '#') {
        if (s[h-2].charAt(0) == '.') answer = false;
      }

      for (int i = 1; i < h-1; i++) {
        if (s[i].charAt(0) == '#') {
          if (s[i-1].charAt(0) == '.' && s[i+1].charAt(0) == '.') answer = false;
        }
      }
    } else {
      //キャンバス角の判定
      if (s[0].charAt(0) == '#') {
        if (s[0].charAt(1) == '.' && s[1].charAt(0) == '.') answer = false;
      }
      if (s[0].charAt(w-1) == '#') {
        if (s[0].charAt(w-2) == '.' && s[1].charAt(w-1) == '.') answer = false;
      }
      if (s[h-1].charAt(0) == '#') {
        if (s[h-2].charAt(0) == '.' && s[h-1].charAt(1) == '.') answer = false;
      }
      if (s[h-1].charAt(w-1) == '#') {
        if (s[h-2].charAt(w-1) == '.' && s[h-1].charAt(w-2) == '.') answer = false;
      }

      //キャンバス上の判定
      for (int i = 1; i < w-1; i++) {
        if (s[0].charAt(i) == '#') {
          if (s[0].charAt(i-1) == '.' && s[0].charAt(i+1) == '.' && s[1].charAt(i) == '.') answer = false;
        }
      }

      //キャンバス下の判定
      for (int i = 1; i < w-1; i++) {
        if (s[h-1].charAt(i) == '#') {
          if (s[h-1].charAt(i-1) == '.' && s[h-1].charAt(i+1) == '.' && s[h-2].charAt(i) == '.') answer = false;
        }
      }

      //キャンバス左の判定
      for (int i = 1; i < h-1; i++) {
        if (s[i].charAt(0) == '#') {
          if (s[i-1].charAt(0) == '.' && s[i+1].charAt(0) == '.' && s[i].charAt(1) == '.') answer = false;
        }
      }

      //キャンバス右の判定
      for (int i = 1; i < h-1; i++) {
        if (s[i].charAt(w-1) == '#') {
          if (s[i-1].charAt(w-1) == '.' && s[i+1].charAt(w-1) == '.' && s[i].charAt(w-2) == '.') answer = false;
        }
      }

      //キャンバス中央の判定
      for (int i = 1; i < h-1; i++) {
        for (int j = 1; j < w-1; j++) {
          if (s[i].charAt(j) == '#') {
            if (s[i-1].charAt(j) == '.' && s[i+1].charAt(j) == '.' && s[i].charAt(j-1) == '.' && s[i].charAt(j+1) == '.') answer = false;
          }
        }
      }
    }

    if (answer) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
