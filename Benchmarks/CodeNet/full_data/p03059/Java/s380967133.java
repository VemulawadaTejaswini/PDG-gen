/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{

        static int MOD = (int)1e9+7;
        static double intval = 0;
        // for dfs
        static int n;
        static int ansi;
        static int[] w;
        static int[] ww;
        static boolean[] isvisited;
        //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(b * (t/a));
        sc.close();
    }

    /*
    For Numeric Analysis
    */

        public static double FuncOfx(double x, int funcnum) {
            switch (funcnum) {
                case 1:
                    return x*x;

                case 2:
                    return Math.exp(-1*x)-x*x;
        
                case 3:
                    return (-1)*Math.exp(-1*x)-2*x;

                case 4:
                    return Math.cos(x);

                case 5:
                    return Math.tanh(x) + 0.2*x + 0.3;
                
                case 6:
                    return 1.2 - Math.tanh(x)*Math.tanh(x);
                
                    default:
                    throw new IllegalArgumentException("Such Func doesn't Exist.");
            }    
        }

        public static void Trapezoidal(int funcnum, int splitnum, double start, double end) {
            double integral_value = 0;
            double height = (end-start) / splitnum;
            for (int i = 0; i < splitnum; i++) {
                integral_value += (FuncOfx(start + height*i, funcnum)      // joutei
                                + FuncOfx(start + height*(i+1), funcnum))  // katei
                                * height / 2;
            }
            intval = integral_value;
            System.out.println("N =" + splitnum + ", I = " + String.format("%.9f", intval));
        }

        

        public static void Newton() {
            int n = 0;
            double x = 1;
            double nextx;
            while (true) {
                n++;
                nextx = x - FuncOfx(x, 2)/FuncOfx(x, 3);
                System.out.println("N = "+n+", x = "+String.format("%.3f", x));
                if (Math.abs(x-nextx) < 1e-4) {
                    break;
                }
                x = nextx;
            }
        }

        public static void Newton_Deceleration() {
            int n = 0;
            double x = 1;
            double mu;
            double nextx;
            while (true) {
                n++;
                mu = 1;
                nextx = returnnextx_in_newton(x, 1, 5, 6);
                while (true) {
                    if (Math.abs(FuncOfx(nextx, 5)) < (1 - (mu/4))*Math.abs(FuncOfx(x, 5))) {
                        nextx = returnnextx_in_newton(x, mu, 5, 6);
                        break;   
                    }else{
                        mu/=2;
                    }
                }
                System.out.println("N = "+n+", x = "+String.format("%.6f", x));
                if (Math.abs(x-nextx) < 1e-6) {
                    break;
                }
                x = nextx;
            }
        }

        public static double returnnextx_in_newton(double x ,double mu, int funcnum, int primefuncnum) {
            return x - mu*(FuncOfx(x, funcnum) / FuncOfx(x, primefuncnum));
        }


        public static void Nibutan(double target, int funcnum) {
            int callcounter = 0;
            double lowbound = 0;
            double highbound = 1;
            double pivot = (lowbound+highbound)/2;
            double tmp;
            if (funcnum == 1) {
                lowbound = 0;
                pivot = (lowbound+highbound)/2;
            }
            while (true) {
                callcounter++;
                if (FuncOfx(highbound, funcnum) < FuncOfx(lowbound, funcnum)) {
                    double tmpd;
                    tmpd = highbound;
                    highbound = lowbound;
                    lowbound = tmpd;
                }

                if (FuncOfx(pivot,funcnum) > target) {
                    System.out.println(String.format("%2d", callcounter) + ": " 
                                    + String.format("%.6f", pivot) + " f(" 
                                    + String.format("%.6f", pivot) +") is " 
                                    + String.format("%.6f",FuncOfx(pivot,funcnum))  + ", so too high :(");
                    tmp = (lowbound + pivot)/2;
                    if ( Math.abs(tmp-pivot) < 0.00005 ) {
                        System.out.println("Found!" +String.format("%.3f", tmp)+" is the answer.");
                        return;
                    }
                    highbound = pivot;
                    pivot = tmp;
                }else if(FuncOfx(pivot,funcnum) < target){
                    System.out.println(String.format("%2d", callcounter) + ": " 
                                + String.format("%.6f", pivot) + " f(" + String.format("%.6f", pivot) +") is " 
                                + String.format("%.6f",FuncOfx(pivot,funcnum))  + ", so too low :(");
                    tmp = (highbound + pivot)/2;
                    if ( Math.abs(tmp-pivot) < 0.00005 ) {
                        System.out.println("Found!" +String.format("%.3f", tmp)+" is the answer.");
                        return;
                    }
                    lowbound = pivot;
                    pivot = tmp;
                }
            }        
        }

    /*
    Numeric Analysis End
    */


        private static long[][] CombinationLong_nCk(long n, long k) {
            n++; k++;
            long[][] ans = new long[(int)n][(int)k];
            for (int i = 0; i < n; i++) {
                ans[i][0] = 1;
            }
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < k-1; j++) {
                    if (i < j) {
                        ans[i][j] = 0;
                    }else{
                        ans[i+1][j+1] = ans[i][j] + ans[i][j+1];
                    }
                }
            }
            return ans;
        }

        public static int gcd_int(int a, int b) {
            if (b == 0) {
                return a;
            }else{
                return gcd_int(b, a%b);
            }
        } 

        public static long gcd_long(long a, long b) {
        
            if (a < b) {
                long tmpp = a;
                a = b;
                b = tmpp;
            }
            if (b == 0) {
                return a;
            }else{
                return gcd_long(b, a%b);
            }
        }

        public static int lcm_int(int a, int b) {
            int gcd = gcd_int(a,b);
            return a/gcd*b;
        }

        public static long lcm_long(long a, long b) {
            long gcd = gcd_long(a,b);
            return a/gcd*b;
        }
        
        public static int ManhattanDist(int x, int y, int xx, int yy) {
            return(Math.abs(xx-x) + Math.abs(yy-y));
        }

            public static void dfs(int placenow) {
                // if went all -> success! 
                // if not went all -> fail...
            
                /*
                dfs    
                Go All Place that there is wayto to and not having been yet. 

                if island 1 is start point, dfs(1);
                if there is wayto to island 2 and island 3,
                - island 2 changes non-visited -> visited, and dfs(2).
                - island 3 changes non-visited -> visited, and dfs(3).
    
                */

                isvisited[placenow] = true;
                boolean success = true;
                for (int i = 0; i < n; i++) {
                    if (isvisited[i] == false) { // not go all place
                        success = false;
                        break;
                    }
                }
                if (success) {
                    ansi++;
                    isvisited[placenow] = false;
                    return;
                }

                for (int i = 0; i < n; i++) {
                    if (w[i] == placenow && isvisited[ww[i]] == false ) {
                        dfs(ww[i]);
                    }else if(ww[i] == placenow && isvisited[w[i]] == false){
                        dfs(w[i]);
                    }else{
                        continue;
                    }
                }
                isvisited[placenow] = false;
                return;
            }

}

