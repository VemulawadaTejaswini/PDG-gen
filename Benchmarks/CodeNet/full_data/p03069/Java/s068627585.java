import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();

        int[] sum = new int[N+1];
        sum[0]=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='#'){
                sum[i+1]=sum[i]+1;
            }else{
                sum[i+1]=sum[i];
            }
        }
        int ans=N;
        for(int i=0;i<=N;i++){
            int cnt = sum[i] + ( (N-i) - (sum[N]-sum[i]) );
            // System.out.println(cnt);
            if(ans>cnt)ans=cnt;
        }
        System.out.println(ans);
    }
}