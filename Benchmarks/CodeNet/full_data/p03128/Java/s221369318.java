import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] match = new int[]{6,2,5,5,4,5,6,3,7,6};
        Map<Integer,Integer> number = new HashMap<>();
        for(int m=0; m<M; m++){
            int a = sc.nextInt();
            number.put(a, match[a]);
        }

        int[] digit = new int[N+1];
        Arrays.fill(digit, -1000000);
        digit[0] = 0;
        int[] first = new int[N+1];

        for(int n=1; n<=N; n++){
            for(int d: number.keySet()){
                if(n-number.get(d)>=0 && digit[n]<=1+digit[n-number.get(d)]){
                    digit[n] = 1+digit[n-number.get(d)];
                    first[n] = d;
                }
            }
        }

        int m = N;
        while(m>0){
            System.out.print(first[m]);
            m -= match[first[m]];
        }
        System.out.println();
    }
}
