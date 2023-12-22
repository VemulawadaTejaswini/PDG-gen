import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int[] grundy = new int[K+2];
        for (int i=K+1;i>=0;i--) {
            boolean flag = false;
            for (int j=0;j<N;j++) {
                if (i+a[j]<K+2) {
                    if (grundy[i+a[j]]==0) flag=true;
                }
            }
            if (flag) grundy[i]=1;
            else grundy[i]=0;
        }
        if (grundy[0]==1) System.out.println("First");
        else System.out.println("Second");
    }
}