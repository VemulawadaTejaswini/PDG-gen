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
        // System.out.println(Arrays.toString(ruiseki));

        long ans = (1L<<60);
        for (int i=1;i<N-2;i++) {
            int[] f = new int[2];
            int[] b = new int[2];
            f[0] = ~Arrays.binarySearch(ruiseki, 0, i+2, ruiseki[i+1]/2, (o1, o2)->o1<=o2?1:-1)-1;
            b[0] = ~Arrays.binarySearch(ruiseki, i+2, N+1, (ruiseki[N]+ruiseki[i+2])/2, (o1, o2)->o1<=o2?1:-1)-1;
            f[1] = ~Arrays.binarySearch(ruiseki, 0, i+2, ruiseki[i+1]/2, (o1, o2)->o1<o2?1:-1)-1;
            b[1] = ~Arrays.binarySearch(ruiseki, i+2, N+1, (ruiseki[N]+ruiseki[i+2])/2, (o1, o2)->o1<o2?1:-1)-1;
            // System.out.println("f: "+f);
            // System.out.println("i: "+i);
            // System.out.println("b: "+b);
            for (int k=0;k<2;k++) {
                for (int l=0;l<2;l++) {
                    for (int front=f[k]-3;front<=f[k]+3;front++) {
                        for (int back=b[l]-3;back<=b[l]+3;back++) {
                            if (!(0<=front && front<i && i<back && back<N-1)) continue;
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
            }
        }
        System.out.println(ans);
    }
}