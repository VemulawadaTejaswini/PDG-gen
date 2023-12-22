import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int tate = Integer.parseInt(stdIn.next());
    int yoko = Integer.parseInt(stdIn.next());
    char[][] a = new char[tate][yoko];
    int[][] b = new int[tate+2][yoko+2];
    int[][] c = new int[tate+2][yoko+2];
    for(int i = 0;i<a.length;i++) {
      String n = stdIn.next();
      for(int j = 0;j<a[i].length;j++) {
        a[i][j] = n.charAt(j);
      }
    }
    hantei(a,b);
    for(long k = 1;k<1000000000;k++) {
      change(b,c);
      if(yaru(c)) {
        System.out.println(k);
        break;
      }
        utusu(b,c);
    }
  }

  static void hantei(char[][] a,int[][] b) {
    for(int i = 0;i<a.length;i++) {
      for(int j = 0;j<a[i].length;j++) {
        if(a[i][j] == '#') b[i+1][j+1] = 1;
      }
    }
  }

  static void change(int[][] b,int[][] c) {
    for(int i = 1;i<b.length-1;i++) {
      for(int j = 1;j<b[i].length-1;j++) {
        if(b[i][j]==1) {
          c[i][j] = 1;
          c[i+1][j] = 1;
          c[i-1][j] = 1;
          c[i][j-1] = 1;
          c[i][j+1] = 1;
        }
      }
    }
  }

  static boolean yaru(int[][] a) {
    for(int i = 1;i<a.length-1;i++) {
      for(int j = 1;j<a[i].length-1;j++) {
        if(a[i][j]==0) return false;
      }
    }
    return true;
  }

  static void utusu(int[][] a,int[][] b) {
    for(int i = 0;i<a.length;i++) {
      for(int j = 0;j<a[i].length;j++) {
        a[i][j] = b[i][j];
      }
    }
  }
}