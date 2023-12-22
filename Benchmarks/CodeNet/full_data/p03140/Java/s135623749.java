import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        int diff=0;
        for(int i=0; i<N; i++){
            char ca = A.charAt(i);
            char cb = B.charAt(i);
            char cc = C.charAt(i);

            int tmpPlanA=0;
            if(ca != cb){
                tmpPlanA++;
            }
            if(ca != cc) {
                tmpPlanA++;
            }

            int tmpPlanB=0;
            if(cb != ca){
                tmpPlanB++;
            }
            if(cb != cc) {
                tmpPlanB++;
            }

            int tmpPlanC=0;
            if(cc != ca){
                tmpPlanC++;
            }
            if(cc != cb) {
                tmpPlanC++;
            }

            int plan=tmpPlanA;
            if(plan>tmpPlanB){
                plan=tmpPlanB;
            }
            if(plan>tmpPlanC){
                plan=tmpPlanC;
            }
            diff+=plan;
        }
        System.out.printf("%d%n",diff);
    }

}
