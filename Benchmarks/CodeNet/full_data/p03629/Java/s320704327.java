import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    HashMap<String, Integer> alpha = new HashMap<String, Integer>();
    int len = A.length();
    int index = 0;
    for(char i = 'a'; i <= 'z'; i++) {
      alpha.put(String.valueOf(i), index);
      index++;
    }
    ArrayList[] list = new ArrayList[26];
    for(int i = 0; i < 26; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < len; i++) {
      String a = String.valueOf(A.charAt(i));
      list[alpha.get(a)].add(i);
    }
    int[] dplen = new int[len];
    String[] dpstr = new String[len];
    dplen[len - 1] = 1;
    if(A.charAt(len - 1) == 'a') {
      dpstr[len - 1] = "b"; 
    } else {
      dpstr[len - 1] = "a";
    }
    for(int i = len - 2; i >= 0; i--) {
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
          if(b >= i) {
            c = b;
            right = med;
          } else {
            left = med + 1;
          }
        }
        String str = s;
        int d = 1;
        if(c + 1 < len) {
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
      dplen[i] = minlen;
      dpstr[i] = minstr;
    }
    System.out.println(dpstr[0]);
  }
}