/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    char[] seq = br.readLine().toCharArray();
    char[] seq2 = new char[n];
    for (int i=0; i<n; i++) {
      seq2[i] = seq[i+n];
    }
    long sum = 0;
    for (int i=0; i<(1<<n); i++) {
      StringBuilder front = new StringBuilder();
      StringBuilder back = new StringBuilder();
      for (int j=0; j<n; j++) {
        if ((i&(1<<j))>0) {
          front.append(seq[j]);
        } else {
          back.append(seq[j]);
        }
      }
      front.reverse();
      back.reverse();
      char[] s1 = back.toString().toCharArray();
      char[] s2 = front.toString().toCharArray();
      int s1Index = 0;
      int s2Index = 0;
      Long[][] dp = new Long[s1.length+1][s2.length+1];
      long nWays = solve(seq2, s1, s2, s1Index, s2Index, dp);
      sum += nWays;
    }
    System.out.println(sum);
  }
  static long solve(char[] seq2, char[] s1, char[] s2, int s1Index, int s2Index, Long[][] dp) {
    if (s1Index==s1.length && s2Index==s2.length) {
      return 1L;
    }
    if (dp[s1Index][s2Index]!=null) {
      return dp[s1Index][s2Index];
    }
    long sum = 0;
    int cIndex = s1Index + s2Index;
    if (s1Index<s1.length && seq2[cIndex]==s1[s1Index]) {
      sum += solve(seq2, s1, s2, s1Index+1, s2Index, dp);
    }
    if (s2Index<s2.length && seq2[cIndex]==s2[s2Index]) {
      sum += solve(seq2, s1, s2, s1Index, s2Index+1, dp);
    }
    return dp[s1Index][s2Index] = sum;
  }
}
