import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] a = new long[N];
        for(int i=0;i<N;++i)a[i]=scan.nextLong();
        long[] sum = new long[N+2];
        sum[0]=sum[1]=0;
        for(int i=0;i<N;++i)sum[i+2]=sum[i]+a[i];
        long ans = Long.MIN_VALUE;
        int minIndex[] = new int[2];
        int maxIndex=0;
        int minin=0;
        for(int i=0;i<2;++i)minIndex[i]=i;
        for(int i=2;i<N+2;++i){
            if(ans < sum[i]-sum[minIndex[i%2]]){
                ans = sum[i] - sum[minIndex[i%2]];
                maxIndex = i;
                minin = minIndex[i%2];
            }
            if(sum[minIndex[i%2]] > sum[i])minIndex[i%2]=i;
        }
        System.out.println(ans);
        List<Integer> list = new ArrayList<>();
        for(int i=maxIndex+1;i<N+2;++i)list.add(N--);
        for(int i=0;i<minin;++i){
            N--;
            list.add(1);
        }
        while(N>1){
            list.add(2);
            N-=2;
        }
        System.out.println(list.size());
        for(int i : list)System.out.println(i);

    }
}