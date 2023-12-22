
import java.io.*;
import java.util.StringTokenizer;

public class ExpressB76D {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int n = in.nextInt();
        int[] time = new int[n];
        for (int i = 0; i < n; i++) time[i] = in.nextInt();
        int[] maxV = new int[n + 1];
        for (int i = 0; i < n; i++) maxV[i] = in.nextInt();
        maxV[n] = 0;
        double distance = 0;
        double curV = 0;
        int tOld = 0;
        for (int i = 0; i < n; i++) {
            //Train will accelerate for some period of time, reach the cap for some period of time, and decelerate.
            int tNew = tOld; //tTerm = terminal velocity
            double tTerm = tOld + maxV[i] - curV;
            double accTime = tOld + time[i];
            for (int j = i + 1; j <= n; j++) { //When do we need to decelerate to reach this speed?
                tNew += time[j - 1];
                int newGoal = maxV[j]; //Need to be at newGoal by time tNew
                //curV + (tRes - tOld) - (tNew - tRes) = newGoal.  2 * tRes = newGoal + tOld + tNew - curV
                double tRes = -1 * curV;
                tRes += tOld + tNew + newGoal;
                tRes /= 2;
                if (tRes > tTerm) {
                    //curV + (tTerm - tOld) - (tNew - tRes) = newGoal.
                    //tRes = newGoal + tOld + tNew - curV - tTerm
                    tRes = -1 * curV + -1 *  tTerm;
                    tRes += newGoal + tOld + tNew;
                }
                
                if (tRes < accTime) accTime = tRes;
            }
            tNew = tOld + time[i];
            if (accTime > tTerm) {
                //Accelerating tOld through tTerm
                //No change tTerm through accTime
                //Decelerating accTime through tNew
                distance += curV * (tTerm - tOld) + (tTerm - tOld) * (tTerm - tOld) / 2;
                curV += tTerm - tOld;
                distance += curV * (accTime - tTerm);
                distance += curV * (tNew - accTime) - (tNew - accTime) * (tNew - accTime) / 2;
                curV -= tNew - accTime;
            } else {
                //Accelerating tOld through accTime
                //Decelerating accTime through tNew
                distance += curV * (accTime - tOld) + (accTime - tOld) * (accTime - tOld) / 2;
                curV += accTime - tOld;
                distance += curV * (tNew - accTime) - (tNew - accTime) * (tNew - accTime) / 2;
                curV -= tNew - accTime;
            }
            
        }
        System.out.println(distance);
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
