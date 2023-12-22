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
        int innerAB = 0;
        for(String s: S){
            if(s.startsWith("B")) startB++;
            if(s.endsWith("A")) endA++;
            innerAB += countAB(s);
            if(!s.startsWith("B") && s.endsWith("A")) N--;
        }

        if(endA==N && startB==N) System.out.println(innerAB + N - 1);
        else System.out.println(innerAB + Math.min(endA, startB));

    }
}
