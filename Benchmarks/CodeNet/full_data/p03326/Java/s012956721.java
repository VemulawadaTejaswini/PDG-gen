import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Long[][] a = new Long[N][3];
        for(int i =0;i<N;i++){
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
            a[i][2] = sc.nextLong();
        }
        PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(Search(M,N,a,1L,1l,1l));
        pq.add(Search(M,N,a,1l,1l,-1l));
        pq.add(Search(M,N,a,1l,-1l,1l));
        pq.add(Search(M,N,a,1l,-1l,-1l));
        pq.add(Search(M,N,a,-1l,1l,1l));
        pq.add(Search(M,N,a,-1l,1l,-1l));
        pq.add(Search(M,N,a,-1l,-1l,1l));
        pq.add(Search(M,N,a,-1l,-1l,-1l));
        System.out.print(pq.poll());
        sc.close();
    }
    public static Long Search(int M,int N,Long[][] L,Long x,Long y,Long z){
        PriorityQueue<Long> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        Long ans = 0l;
        for(int i = 0; i<N;i++){
            pq2.add(L[i][0]*x+L[i][1]*y+L[i][2]*z);
        }
        for(int i = 0; i<M;i++){
            ans += pq2.poll();
        }
        return ans;
    }
}