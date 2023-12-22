import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long[][] T = new long[3][N];
        for(int i = 0; i < N; i++){
            T[0][i] = sc.nextLong();
            T[1][i] = sc.nextLong();
        }
        sc.close();

        long numT = T[0][0];
        long numA = T[1][0];

        for(int i = 1; i < N; i++){
            long t, a;
            if(numT%T[0][i] == 0)
                t = numT%T[0][i];
            else
                t = numT%T[0][i]+1;
            if(numT%T[1][i] == 0)
                a = numA%T[1][i];
            else
                a = numA%T[1][i]+1;
            long min = Math.max(t, a);
            numT = min*T[0][i];
            numA = min*T[1][i];
        }

        System.out.println(numT+numA);
    }
}