import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc));
    }

    public static int solve(Scanner sc){
        int N = sc.nextInt();
        int[] d = new int[N];

        for(int i=0;i<N;i++){
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        int cnt = 1;


        for(int i=1;i<N;i++){
            if(d[i] != d[i-1]) cnt++;
        }

        return cnt;
    }
}