import java.lang.Math;

public class Main {
  public static String LCS(String s1, String s2) {
    if (s1.isEmpty() || s2.isEmpty()) {
      return "";
    }
    int l1 = s1.length();
    int l2 = s2.length();

    // memorization
    int[][] m = new int[l1][l2];
    int maxLen = 0;

    // fill the 0th row
    boolean isFound = false;
    for (int i = 0; i < l1; i++) {
        if (isFound || s1.charAt(i) == s2.charAt(0)) {
            m[i][0] = 1;
            isFound = true;
        } else {
            m[i][0] = 0;
        }
    }

    // fill the 0th column
    isFound = false;
    for (int j = 0; j < l2; j++) {
        if (isFound || s2.charAt(j) == s1.charAt(0)) {
            m[0][j] = 1;
            isFound = true;
        } else {
            m[0][j] = 0;
        }
    }

    // m[i][j] stores the maximum length of subsequence until s1.subString(0, i+1), s2.subString(0, j+1)
    for (int i = 1; i < l1; i++) {
        for (int j = 1; j < l2; j++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                m[i][j] = m[i-1][j-1] + 1;
                maxLen = Math.max(m[i][j], maxLen);
        }   else {
                m[i][j] = Math.max(m[i-1][j], m[i][j-1]);
            }
        }
    }

    // If you want to know just the length of the lcs, return maxLen.
    // Here we'll try to print the lcs.
    StringBuilder sb = new StringBuilder();
    int i = l1 - 1, j = l2 - 1;
    while (i > 0 && j > 0) {
      if (s1.charAt(i) != s2.charAt(j)) {
        if (m[i-1][j] > m[i][j-1]) i--;
        else j--;
      } else {
        sb.append(s1.charAt(i)); // or s2.charAt(j-1)
        i--; j--;
      }
    }

    return sb.reverse().toString();
  }
}