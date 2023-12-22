import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[] S = (scn.nextLine() + "E").toCharArray();

    int[] answer = new int[S.length - 1];
    Arrays.fill(answer, 0);

    char prevChar = S[0];
    int prevBorderInd = 0;
    for (int i = 0; i < S.length; i++) {
      if (S[i] != prevChar) {
        if (S[i] == 'L') {
          if ((i - prevBorderInd) % 2 == 0) {
            answer[i] += (i - prevBorderInd) / 2;
            answer[i - 1] += (i - prevBorderInd) / 2;
          } else {
            answer[i] += (i - prevBorderInd) / 2;
            answer[i - 1] += (i - prevBorderInd) / 2 + 1;
          }
          prevChar = 'L';
        }

        if (S[i] == 'R' || S[i] == 'E') {
          if ((i - prevBorderInd) % 2 == 0) {
            answer[prevBorderInd] += (i - prevBorderInd) / 2;
            answer[prevBorderInd - 1] += (i - prevBorderInd) / 2;
          } else {
            answer[prevBorderInd] += (i - prevBorderInd) / 2 + 1;
            answer[prevBorderInd - 1] += (i - prevBorderInd) / 2;
          }
          prevChar = 'R';
        }
        prevBorderInd = i;

      }

    }
    for (int ans : answer) {
      System.out.printf("%d ", ans);
    }

  }
}