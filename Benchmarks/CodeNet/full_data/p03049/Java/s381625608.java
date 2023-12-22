import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a = 0;
    int b = 0;
    int ab = 0;
    int l = 0;
    
    for (int i=0; i<n; i++) {
	  String s = sc.next();
      l = s.length();
      if (s.substring(0,1).equals("B")) {
        b++;
      }
      if (s.substring(l-1,l).equals("A")) {
        a++;
      }
      for (int j=0; j<l-1; j++) {
	    if (s.substring(j, j+2).equals("AB")) {
          ab++;
        }
      }
    }
    
    int ans;
    if (a==b) {
	  ans = ab + Math.min(a,b) - 1;
    } else {
      ans = ab + Math.min(a,b);
    }
    
    System.out.println(ans);
  }
}
