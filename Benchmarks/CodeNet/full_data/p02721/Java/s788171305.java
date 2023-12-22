import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int[] lf = new int[N];
        int[] rf = new int[N];
        int nowDay = 0;
        for(int i=0;i<N;i++){
            if(S[i] == 'o'){
                for(int j=i;j<=i+C;j++) {
                    if(j < N)
                        lf[j] = nowDay;
                }
                i = i+C;
                if(nowDay < K-1)
                    nowDay++;
            }
        }
        for(int i=N-1;i>=0;i--){
            if(S[i] == 'o'){
                for(int j=i;j>=i-C;j--){
                    if(j>=0)
                        rf[j] = nowDay;
                }
                i = i-C;
                if(nowDay > 0)
                    nowDay --;
            }
        }
        for(int i=0;i<N;i++){
            if(lf[i] == rf[i] && S[i] == 'o'){
                System.out.println(i+1);
            }
        }
    }

    private static void showArr(int[] a){
        for(int p:a){
            System.out.print(p);
        }
        System.out.println();
    }

}
