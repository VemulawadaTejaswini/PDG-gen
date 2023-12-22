
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        // int[] q = new int[N];
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i=0;i<N;i++){
            // q[i]=sc.nextInt();
            q.add(sc.nextInt());
        }
        for(int i=0;i<M;i++){
            int num = q.poll();
            num/=2;
            q.add(num);
        }
        long ans = 0;
        for(int i=0;i<N;i++){
            int num = q.poll();
            ans+=num;
        }

        System.out.println(ans);
        sc.close();
    }
}