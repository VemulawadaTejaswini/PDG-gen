import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    int d = stdIn.nextInt();
    a = a-1;
    b = b-1;
    c = c-1;
    d = d-1;
    String s = stdIn.next();
    int l = s.length();
    char[] e = new char[l];
    for(int i = 0;i<e.length;i++) {
      e[i] = s.charAt(i);
    }
    int k = 0;
    int t = 0;
    long save = 10000000;
    if(a>b) {
      for(int i = a;i<e.length;i++) {
        if(saiki(i,e,c,save)) {
          save = c;
          k = 1;
          break;
        }
      }
    for(int i = b;i<e.length;i++) {
      if(saiki(i,e,d,save)) {
        l = 1;
        break;
      }
    }
  }
  if(a<b) {
    for(int i = b;i<e.length;i++) {
      if(saiki(i,e,d,save)) {
        l = 1;
        save = d;
        break;
      }
    }
    for(int i = a;i<e.length;i++) {
      if(saiki(i,e,c,save)) {
        k = 1;
        break;
      }
    }
  }
    if(k==1&&l==1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
  static boolean saiki(int a,char[] e,int c,long save) {
    if(save==a) {
      return false;
    }
    if(a+1<e.length&&a!=c) {
      if(e[a+1]=='.') {
        if(a+1==c) return true;
        //saiki(a+1,e,c);
      }
    }
    if(a+2<e.length&&a!=c) {
      if(e[a+2]=='.') {
        if(a+2==c) return true;
        //saiki(a+2,e,c);
      }
    }
    return false;
  }
}
