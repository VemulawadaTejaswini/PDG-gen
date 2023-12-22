import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        int M;
        int[] Si;
        int[] Ci;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
            Si = new int[M];
            Ci = new int[M];
            for (int i = 0; i < M; i++) {
                Si[i] = sc.nextInt();
                Ci[i] = sc.nextInt();
            }
        }
        int[] num = new int[N];
        Arrays.fill(num,-1);

        for (int i = 0; i < M; i++) {
            int s = Si[i];
            int c = Ci[i];
            if(num[s-1] == -1){
                num[s-1] = c;
            }else if(num[s-1] == c){
                continue;
            }else{
                System.out.println(-1);
                return;
            }
        }

        if(num[0] ==0){
            System.out.println(-1);
            return;
        }
        if(num[0] ==-1){
            num[0] =1;
        }
        
        for (int i = 1; i < M; i++) {
            if(num[i] == -1){
                num[i] = 0;
            }
        }
        int result = 0;
        //System.out.println(Arrays.toString(num));
        for (int i = 0; i < M; i++) {
            result = (result * 10) + num[i];
        }


        System.out.println(result);
    }
}
