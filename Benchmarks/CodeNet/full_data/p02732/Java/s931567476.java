import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L [] = new int[N+1];
        int DP[] = new int[N+1];
        int DP2[] = new int[N+1];
        int list[] = new int[N+1];
        Arrays.fill(L,0);
        Arrays.fill(DP,0);
        Arrays.fill(DP2,0);
        int sum = 0;
        for(int i=1;i<=N;i++){
            int num = sc.nextInt();
            L[num]++;
            list[i]=num;
        }
        for(int i=1;i<=N;i++) {
            if(L[i]!=0){
                DP[i] = (L[i]*(L[i]-1))/2;
                DP2[i] = ((L[i]-1)*(L[i]-2))/2;
                sum+=DP[i];
            }
        }
        for(int i=1;i<=N;i++){
           int opt = sum-DP[list[i]]+DP2[list[i]];
            System.out.println(opt);
        }
    }
}