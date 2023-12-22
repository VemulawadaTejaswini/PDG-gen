import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long T1 = sc.nextLong(), T2 = sc.nextLong();
        long A1 = sc.nextLong(), A2 = sc.nextLong();
        long B1 = sc.nextLong(), B2 = sc.nextLong();
        long D1 = A1-B1, D2 = A2-B2;

        /*easier problem:
         * Yoichi runs D1 m/min for T1 minutes, and then runs D2 m/min for T2 minutes.
         * How many times will Yoichi pass the start point?
         * Notice: D1 and/or D2 might be negative.
         */

        if(T1*D1+T2*D2==0) System.out.println("infinity");
        else if((T1*D1>0)==(T1*D1+T2*D2>0)) System.out.println(0);
        else{
            if(D1>0){
                D1 *= -1;
                D2 *= -1;
            }
            //now we can assume them: D1<0, D2>0, and T1*D1+T2*D2>0.
            long cycleDistance = T1*D1+T2*D2;
            long backLimit = Math.abs(D1*T1);
            System.out.println(2 * (backLimit/cycleDistance) + (backLimit%cycleDistance==0 ? 0 : 1));

        }
    }
}
