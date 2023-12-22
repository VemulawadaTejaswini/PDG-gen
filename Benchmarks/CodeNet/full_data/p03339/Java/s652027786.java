import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        String d = "EW";
        int[] e = new int[N];
        if(S.charAt(0)==d.charAt(0)){
            e[0] = 1;
        }
        else{
            e[0] = 0;
        }

        for(int i=1; i<N; i++){
            if(S.charAt(i)==d.charAt(0)){
                e[i] = e[i - 1] + 1;
            }
            else{
                e[i] = e[i - 1];
            }
        }
        int[] sum = new int[N];
        sum[0] = e[N - 1] - e[0];
        int ans = sum[0];
        for(int i=1; i<N; i++){
            sum[i] = i - e[i - 1] + e[N - 1] - e[i];
            ans = Math.min(ans, sum[i]);
        }
        System.out.println(ans);
    }
}