import java.util.*;
import java.io.*;
class Main {
    static class Triplet {
        long x, y;
        int z;
        Triplet(long x, long y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    static long MOD = (long)(1e9+7);
    static long[] segTree;
    static void update(int node, int left, int right, int idx, long value) {
        if(left>right)
            return;
        if(left==right && idx==left) {
            segTree[node] = value;
            return;
        }
        int mid = left + (right-left)/2;
        if(idx<=mid)
            update(2*node+1, left, mid, idx, value);
        else update(2*node+2, mid+1, right, idx, value);
        segTree[node] = Math.max(segTree[2*node+1], segTree[2*node+2]);
    }
    static long query(int node, int left, int right, int start, int end) {
        if(left>right || left>end || right<start)
            return 0;
        if(left>=start && right<=end)
            return segTree[node];
        int mid = left + (right-left)/2;
        long q1 = query(2*node+1, left, mid, start, end);
        long q2 = query(2*node+2, mid+1, right, start, end);
        return Math.max(q1, q2);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] heights = new long[n];
        long[] beauties = new long[n];
        for(int i = 0; i<n; i++)
            heights[i] = sc.nextLong();
        for(int i = 0; i<n; i++)
            beauties[i] = sc.nextLong();
        Triplet[] triplets = new Triplet[n];
        segTree = new long[4*n];
        for(int i = 0; i<n; i++)
            triplets[i] = new Triplet(heights[i], beauties[i], i);
        Arrays.sort(triplets, (a, b)->Long.compare(a.x, b.x));
        for(int i = 0; i<n; i++) {
            Triplet curr = triplets[i];
            long height = curr.x;
            long beauty = curr.y;
            int idx = curr.z;
            long ans = beauty;
            if(idx!=0) {
                long q = query(0, 0, n-1, 0, idx-1);
                ans+=q;
            }
            update(0, 0, n-1, idx, ans);
        }
        System.out.println(query(0, 0, n-1, 0, n-1));
    }
}