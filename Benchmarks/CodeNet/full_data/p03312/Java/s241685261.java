import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        Long[] ruiseki = new Long[N+1];
        Arrays.fill(ruiseki, 0L);
        for (int i=0;i<N;i++) {
            ruiseki[i+1] = A[i]+ruiseki[i];
        }

        long ans = (1L<<60);
        for (int i=1;i<N-2;i++) {
            // int f = ~Arrays.binarySearch(ruiseki, 1, i+2, ruiseki[i+1]/2, (o1, o2)->o1>o2?1:-1);
            // int b = ~Arrays.binarySearch(ruiseki, i+2, N+1, (ruiseki[N]+ruiseki[i+2])/2, (o1, o2)->o1>o2?1:-1);
            int f = ~Arrays.binarySearch(ruiseki, 1, i+2, ruiseki[i+1]/2, (o1, o2)->o1>o2?1:-1)-1;
            int b = ~Arrays.binarySearch(ruiseki, i+2, N+1, (ruiseki[N]+ruiseki[i+2])/2, (o1, o2)->o1>o2?1:-1)-1;
            // System.out.println("f: "+f);
            // System.out.println("i: "+i);
            // System.out.println("b: "+b);
            for (int front=f-5;front<=f+5;front++) {
                for (int back=b-5;back<=b+5;back++) {
                    if (!(0<=front && front<i && i<back && back<=N-1)) continue;
                    long[] val = new long[4];
                    val[0] = ruiseki[front+1]; // P
                    val[1] = ruiseki[i+1]-ruiseki[front+1]; // Q
                    val[2] = ruiseki[back+1]-ruiseki[i+1]; // R
                    val[3] = ruiseki[N]-ruiseki[back+1]; // S
                    Arrays.sort(val);
                    ans = Math.min(ans, val[3]-val[0]);
                    // System.out.println(front);
                    // System.out.println(back);
                }
            }
        }
        System.out.println(ans);
    }
}