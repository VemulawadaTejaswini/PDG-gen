import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Long.parseLong;
import static java.lang.Integer.parseInt;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = parseInt(in.readLine());
      long[] seq = new long[n];

      for(int i=0; i<n; i++)
        seq[i] = parseLong(in.readLine());

      Arrays.parallelSort(seq);

      long[] resU = new long[n];  // /\/\Pattern
      long[] resD = new long[n];  // \/\/Pattern

      int l = n-1;
      resU[0] = -1;
      resD[0] =  1;
      for(int i=1; i<l; i++) {
        resU[i] = (i&1) == 0 ? -2 :  2;
        resD[i] = (i&1) == 0 ?  2 : -2; 
      }
      resU[l] = (n&1) == 0 ?  1 : -1;
      resD[l] = (n&1) == 0 ? -1 :  1;

      Arrays.parallelSort(resU);
      Arrays.parallelSort(resD);

      long sumU=0,sumD=0;
      for(int i=0; i<n; i++) {
        sumU += seq[i] * resU[i];
        sumD += seq[i] * resD[i];
      }

      System.out.println(Math.max(sumU, sumD));
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}