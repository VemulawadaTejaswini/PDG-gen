import java.util.*;
import java.lang.*;

public class Main {
    static int countAB(String s){
        return (s.length() - s.replaceAll("AB", "").length()) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] S = new String[N];
        for(int n=0; n<N; n++) S[n]=sc.next();

        int endA = 0;
        int startB = 0;
        int BandA = 0;
        int innerAB = 0;
        for(String s: S){
            if(s.startsWith("B")){
                if(s.endsWith("A")) BandA++;
                else startB++;
            }else if(s.endsWith("A")) endA++;

            innerAB += countAB(s);
        }

        if(endA==0 && startB==0) System.out.println(innerAB + BandA - 1);
        else System.out.println(innerAB + Math.min(endA+BandA, startB+BandA));

    }
}
