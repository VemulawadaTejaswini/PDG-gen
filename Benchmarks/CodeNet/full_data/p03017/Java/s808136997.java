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
    if(saiki(a,e,c)&&saiki(b,e,d)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
  static boolean saiki(int a,char[] e,int c) {
    if(a+1<e.length&&a!=c) {
      if(e[a+1]=='.') {
        saiki(a+1,e,c);
      } else if(e[a+1]=='#') {
        //break;
      }
    }
    if(a+2<e.length&&a!=c) {
      if(e[a+2]=='.') {
        saiki(a+2,e,c);
      } else if(e[a+2]=='#') {
        //break;
      }
    }
    if(a==c) {
      return true;
    } else {
      return false;
    }
  }
}
