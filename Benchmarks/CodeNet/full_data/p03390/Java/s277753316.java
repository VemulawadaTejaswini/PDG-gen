import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(bf.readLine());
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        for(int q=0; q<Q; q++) {
          StringTokenizer st = new StringTokenizer(bf.readLine());
          int A = Integer.parseInt(st.nextToken());
          int B = Integer.parseInt(st.nextToken());
          long low = 0;
          long high = 1L*1000000000*1000000000;
          while(low < high) {
            long mid = (low + high + 1)/2;
            if(isPossible(mid, A, B)) {
              low = mid;
            }
            else high = mid-1;
          }
          out.println(low);
        }
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n];
        // for(int i=0; i<n; i++) a[i] =  Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
    public static boolean isPossible(long max, long A, long B) {
      long prod = 1L*A*B;
      if((max < A) && (max < B)) return true;
      long last_A = max;
      if(max >= A) last_A = max+1;
      long last_B = max;
      if(max >= B) last_B = max+1;
     long first_A = 1;
      if(A == 1) first_A = 2;
      long first_B = 1;
      if(B == 1) first_B = 2;
      if(1L*first_A*last_B >= prod) return false;
      if(1L*first_B*last_A >= prod) return false;

      if(A <= max) {
        long toMult = (max+1-A);
        if(B <= toMult) toMult++;
        if(1.0*(A+1)*toMult > prod+1.0) return false;
        long test = 1L*(A+1)*toMult;
        if(test >= prod) return false;

        toMult = (max+1-(A-1));
        if(B <= toMult) toMult++;
        if(1.0*(A-1)*toMult > prod+1.0) return false;
        test = 1L*(A-1)*toMult;
        if(test >= prod) return false;
      }

      if(B <= max) {
        long toMult = (max+1-B);
        if(A <= toMult) toMult++;
        if(1.0*(B+1)*toMult > prod+1) return false;
        long test = 1L*(B+1)*toMult;
        if(test >= prod) return false;

        toMult = (max+1-(B-1));
        if(A <= toMult) toMult++;
        if(1.0*(B-1)*toMult > prod+1) return false;
        test = 1L*(B-1)*toMult;
        if(test >= prod) return false;
      }

      for(int diff = -2; diff <= 2; diff++) {
        if((max + 1 - diff) % 2 == 1) continue;
        long index1 = (max + 1 + diff)/2;
        long index2 = (max + 1 - diff)/2;
        if(index1 >= A) index1++;
        if(index2 >= B) index2++;
        if(1.0*index1*index2 > prod + 1.0) return false;
        if(1L*index1*index2 >= prod) return false; 
      }




      return true;
      //
    }


}
