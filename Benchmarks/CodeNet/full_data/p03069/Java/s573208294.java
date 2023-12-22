import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();
    int[] a;
    a = new int[n];

    String check = "";
    int flg = 0;
    int cnt = 0;
    int scnt = 0;
    int buf = 0;
    int cursor = 0;

    if (s.substring(0,1).equals(".")) {
      cursor++;
      a[0] = 0;
      flg = 1;
    }  
      
    for (int i=1; i<n; i++) {
      check = s.substring(i,i+1);
      if (flg == 0 && check.equals("#")) {
        buf++;
      }
      if (flg == 0 && check.equals(".")) {
        a[cursor] = buf;
        buf = 1;
        flg = 1;
        cursor++;
      }
      if (flg == 1 && check.equals(".")) {
        buf++;
      }
      if (flg == 1 && check.equals("#")) {
        a[cursor] = buf;
        buf = 1;
        flg = 0;
        cursor++;
      }
    }
    
    if (s.substring(n-1,n).equals(".")) {
      cursor++;
      a[cursor] = 0;
    }  
    
    int min = n;
    int total = 0;
    for (int i=1; i<=cursor; i++) {
	  total = 0;
      flg = 0;
      for (int j=1; j<i; j+=2) {
        total += a[j];
      }
      for (int j=i; j<=cursor; j+=2) {
        if (i%2 == 1 && flg == 0) { j++; flg++; } else { flg++; }
        total += a[j];
      }
      if (total < min) {
        min = total;
      }
    }
    
    System.out.println(min);
  }
}
