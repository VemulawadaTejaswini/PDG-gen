import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long x = scan.nextLong();
        long[] a = new long[2*N];
        for(int i=0;i<N;++i)a[i] = scan.nextLong();
        for(int i=0;i<N;++i)a[N+i]=a[i];

        long ans = Long.MAX_VALUE;
        for(int i=0;i<N;++i){
            Deque<Integer> que = new ArrayDeque<>();
            long value=x*i;
            for(int j=N-i;j<N;++j){
                que.addLast(j);
                while(a[que.peekFirst()] > a[j]){
                    que.removeFirst();
                }
            }
            for(int j=N;j<2*N;++j){
                que.addLast(j);
                while(a[que.peekFirst()] > a[j] || j > que.peekFirst()+i ){
                    que.removeFirst();
                }
                value += a[que.peekFirst()];
            }
        ans = Math.min(ans, value);
        }
        System.out.println(ans);
    }
}