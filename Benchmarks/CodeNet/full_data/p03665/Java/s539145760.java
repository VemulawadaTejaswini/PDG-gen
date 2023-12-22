import java.io.*;
import java.util.*;

public class Main {

  private void compute(){
    Scanner scanner = new Scanner (System.in);
    int n = scanner.nextInt();
    int p = scanner.nextInt();
    int e = 0, o = 0;
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
    long or = 0, er = 0;
    for (int i=0;i<=o;i+=2) {
      or += co(o, i);
    }
    for (int i=0;i<=e;i++) {
      er += co(e, i);
    }
    rtn *= or;
    rtn *= er;
    
    System.out.println(rtn);
  }
  
  private static long co(int n, int k) {
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
