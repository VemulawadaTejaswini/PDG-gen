import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    String[] t = new String[q];
    String[] d = new String[q];
    for(int i = 0; i < q; i++) {
      t[i] = sc.next();
      d[i] = sc.next();
    }
    int t1 = -1;
    int t2 = n;
    int left = -1;
    int right = n;
    int[] P = new int[n];
    for(int i = 0; i < n; i++) {
      P[i] = -2;
    }
    while(left < right) {
      int med = (left + right) / 2;
      int pos = med;
      if(P[med] == -2) {
        for(int i = 0; i < q; i++) {
          if((pos == -1) || (pos == n)) break;
          if(s.charAt(pos) == t[i].charAt(0)) {
            if(d[i].equals("L")) {
              pos--;
            } else {
              pos++;
            }
          }
        }
        P[med] = pos;
      } else {
        pos = P[med];
      }
      if(pos == -1) {
        t1 = med;
        left = med + 1;
      } else {
        right = med;
      }
    }
    left = -1;
    right = n;
    while(left < right) {
      int med = (left + right) / 2;
      int pos = med;
      if(P[med] == -2) {
        for(int i = 0; i < q; i++) {
          if((pos == -1) || (pos == n)) break;
          if(s.charAt(pos) == t[i].charAt(0)) {
            if(d[i].equals("L")) {
              pos--;
            } else {
              pos++;
            }
          }
        }
        P[med] = pos;
      } else {
        pos = P[med];
      }
      if(pos == n) {
        t2 = med;
        right = med;
      } else {
        left = med + 1;
      }   
    }
    System.out.println(t2 - t1 - 1);
  }
}