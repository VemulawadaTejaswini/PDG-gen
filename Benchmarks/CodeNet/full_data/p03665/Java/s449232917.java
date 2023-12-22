import java.io.*;
import java.util.*;

public class Main {

  private void compute(){
    Scanner scanner = new Scanner (System.in);
    int n = scanner.nextInt();
    int p = scanner.nextInt();
    int e, o;
    for (int i=0;i<n;i++) {
      if (scanner.nextInt() % 2 == 0)
        e++;
      else
        o++;
    }
    long rtn = 1;
    if (p == 1) {
      rtn *= o;
      o--;
    }
    long or, er;
    for (int i=0;i<=o;i+=2) {
      or += co(o, i);
    }
    for (int i=0;i<=e;i++) {
      er += co(e, i);
    }
    
    System.out.println("");
  }
  
  private static long co(int n, k) {
    long rtn = 1;
    for (int i=0;i<k;i++) {
      rtn *= n - i;
      rtn /= i + 1;
    }
    return rtn;
  }

  public static void main(String[] args) {
    new Main().compute();
  }

}
