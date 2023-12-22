import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int head_b_cnt = 0;
      int tail_a_cnt = 0;
      int h_t_b_a_cnt = 0;
      long cnt = 0;
      for(int i = 0; i < n; i++) {
        String s = sc.next();
        int len = s.length();
        if(s.charAt(0) == 'B' && s.charAt(len - 1) == 'A')
          h_t_b_a_cnt++;
        else if(s.charAt(0) == 'B')
          head_b_cnt++;
        else if(s.charAt(len-1) == 'A')
          tail_a_cnt++;
        cnt += cntAB(s);
      }
      int minCnt = Math.min(head_b_cnt, tail_a_cnt);
      cnt += minCnt;
      head_b_cnt -= minCnt;
      tail_a_cnt -= minCnt;
      int resCnt = head_b_cnt + tail_a_cnt;
      if(h_t_b_a_cnt > 0)
        cnt += h_t_b_a_cnt - 1;
      if(resCnt > 0 && h_t_b_a_cnt > 0)
        cnt++;

      System.out.println(cnt);
  }

  private static int cntAB(String s) {
    int cnt = 0;
    for(int i = 0; i < s.length() - 1; i++) {
      if(s.charAt(i) == 'A' && s.charAt(i+1) == 'B') {
        cnt++;
        i++;
      }
    }
    return cnt;
  }
}