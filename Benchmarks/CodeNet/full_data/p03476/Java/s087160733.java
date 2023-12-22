import java.util.*;

class Main {

   public static void main(String[] args) {
       new Solver().run();
   }

}


class Solver {

    private boolean isPrime(long n) {
        if (n == 0 || n == 1) return false;
        if (n == 2) return true;

        if (n % 2 == 0) return false;

        for (long i = 3; i * i <= n; i+=2) {
            if (n % i == 0) return false; 
        }   
        return true;
    } 

 
    private boolean isLikely2017(int n) {
        if (n == 2) return false;
        return isPrime(n) && isPrime((n + 1) / 2);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for (int i = 0; i < Q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        int[] S = new int[100002];
        S[0] = 0;
        for (int i = 0; i < 100001; i++) {
            if (isLikely2017(i)) {
                S[i+1] = S[i] + 1;
            } else {
                S[i+1] = S[i];
            }
        }

        //for (int i = 0; i < 20; i++) {
        //    System.out.println(String.format("S[%d]=%d ", i, S[i]) + isLikely2017(i));
        //}

        for (int i = 0; i < Q; i++) {
           int ans  = S[r[i] + 1] - S[l[i]];
           System.out.println(ans);
        }


    }
}