import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  =scan.nextInt();
        int K = scan.nextInt();
        int Q = scan.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;++i)A[i]=scan.nextInt();
        int ans = 1000000001;
        for(int i=0;i<N;++i){
            int left=-1, right=ans;
            while(right-left>1){
                int center=(right+left)/2;
                int cnt=0;
                PriorityQueue<Integer> que = new PriorityQueue<>();
                for(int j=0;j<N;++j){
                    if(A[j]<A[i])que.clear();
                    else{
                        que.add(A[j]);
                        if(que.size()>=K){
                            if(que.poll()-A[i]<=center)++cnt;
                            if(cnt>=Q){
                                break;
                            }
                        }
                    }
                }
                if(cnt>=Q)right=center;
                else left=center;
            }
            ans = Math.min(ans, right);
        }
        System.out.println(ans);


    }
}