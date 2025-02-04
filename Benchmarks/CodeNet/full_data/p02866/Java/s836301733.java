import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] m = new long[n];
        long answer = 1;

        if(sc.nextInt() != 0) answer = 0;
        else m[0]++;
        for(int i = 1; i < n; i++){
            int x;
            if((x = sc.nextInt()) == 0){
                answer = 0;
                break;
            }
            m[x]++;
        }

        for(int i = 2; i < n; i++){
            answer *= ((long)Math.pow(m[i-1], m[i]));
        }

        System.out.println(answer % 998244353);

    }

}
