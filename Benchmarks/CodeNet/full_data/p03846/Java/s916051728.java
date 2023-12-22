import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] T = new int[N];
        int[] count = new int[100001];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            T[i]=Integer.parseInt(st.nextToken());
            count[T[i]]++;
        }

        System.out.println(solve(T, count, N));
    }
    public static int solve(int[] T, int[] count, int N){
        if(N%2!=0 && count[0]!=1)
            return 0;
        if(N%2==0){
            for(int i=1 ; i<N; i+=2){
                if(count[i]!=2)
                    return 0;
            }
        }
        else{
            for(int i=2 ; i<N; i+=2){
                if(count[i]!=2)
                    return 0;
            }
        }
        int ans=1;
        int i=0;
        while(i<N/2){
            ans*=2;
            ans=ans%1000000007;
            i++;
        }
        return ans;
    }
}
