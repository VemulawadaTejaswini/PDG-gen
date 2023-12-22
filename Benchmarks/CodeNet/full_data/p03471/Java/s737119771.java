import java.util.*;

public class Main {
    static int numMan;
    static int numGoSen;
    static int numSen;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        float avgDenom = (float)Y/N;
        //System.out.println("Avg denom = " + avgDenom);
        if (avgDenom < 1000 || avgDenom > 10000 || Y%1000 != 0) {
            //System.out.println("Point 1");
            System.out.println("-1 -1 -1"); return;
        }
        if (avgDenom == 1000) {
            //System.out.println("Point 2");
            System.out.println("0 0 " + N); return;
        }
        if (avgDenom == 10000) {
            //System.out.println("Point 3");
            System.out.println(N + " 0 0"); return;
        }

        numMan = Y/10000;
        numGoSen = (Y-10000*numMan)/5000;
        numSen = (Y-10000*numMan-5000*numGoSen)/1000;
        //System.out.println("Initial nums=" + numMan + "," + numGoSen + "," + numSen);
        if (numBills() != N) {
            if (numBills() > N) {
                //System.out.println("Point 4");
                System.out.println("-1 -1 -1"); return;
            }
            int defBills = N-numBills();
            boolean ansFound = false;
            for (int x=0; x<=numMan; x++) {
                for (int y=0; y<=numGoSen+2*x; y++) {
                    //System.out.println("x,y=" + x + "," + y);
                    if (x+4*y == defBills) {
                        numMan -= x;
                        numGoSen += 2*x - y;
                        numSen += 5*y;
                        ansFound = true;
                        break;
                    } else if (x+4*y > defBills) {
                        break;
                    }
                }
                if (ansFound) { break; } 
            }
            if (!ansFound) {
                numMan = -1; numGoSen = -1; numSen = -1;
            }
        }
        System.out.println(numMan + " " + numGoSen + " " + numSen);
    }

    private static int numBills() {
        return numMan+numGoSen+numSen;
    }
}
