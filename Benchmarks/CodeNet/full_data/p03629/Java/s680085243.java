import java.util.*;

public class Main {

  static int[] dplen;
  static String[] dpstr;
  static HashMap<String, Integer> alpha;
  static ArrayList[] list;
  static int len;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    alpha = new HashMap<String, Integer>();
    len = A.length();
    int index = 0;
    for(char i = 'a'; i <= 'z'; i++) {
      alpha.put(String.valueOf(i), index);
      index++;
    }
    list = new ArrayList[26];
    for(int i = 0; i < 26; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < len; i++) {
      String a = String.valueOf(A.charAt(i));
      list[alpha.get(a)].add(i);
    }
    dplen = new int[len];
    for(int i = 0; i < len; i++) {
      dplen[i] = -1;
    }
    dpstr = new String[len];
    dplen[len - 1] = 1;
    if(A.charAt(len - 1) == 'a') {
      dpstr[len - 1] = "b"; 
    } else {
      dpstr[len - 1] = "a";
    }
    dfs(0);
    System.out.println(dpstr[0]);
  }

  public static void dfs(int n) {
    if(dplen[n] != -1) {
      
    } else {
      int minlen = Integer.MAX_VALUE;
      String minstr = "";
      for(char j = 'a'; j <= 'z'; j++) {
        String s = String.valueOf(j);
        ArrayList<Integer> alist = list[alpha.get(s)];
        int c = len;
        int left = 0;
        int right = alist.size();
        while(left < right) {
          int med = (left + right) / 2;
          int b = alist.get(med);
          if(b >= n) {
            c = b;
            right = med;
          } else {
            left = med + 1;
          }
        }
        String str = s;
        int d = 1;
        if(c + 1 < len) {
          if(dplen[c + 1] == -1) dfs(c + 1);
          d = 1 + dplen[c + 1];
          str = s + dpstr[c + 1];
        }
        if(c == len - 1) {
          d = 2;
          str = s + "a";
        }
        if(d < minlen) {
          minlen = d;
          minstr = str;
        }
      }
      dplen[n] = minlen;
      dpstr[n] = minstr;      
    }
  }
}