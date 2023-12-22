import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();
        }
        int[] d = new int[q];
        for (int i = 0; i < q; i++) {
            d[i] = sc.nextInt();
        }
        TreeMap<Integer, ArrayList<Integer>> mapS = new TreeMap<>();
        TreeMap<Integer, ArrayList<Integer>> mapE = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int s = a[i][0];
            int t = a[i][1];
            int x = a[i][2];
            int l = binarySearch(d, Math.max(0, s-x));
            int r = binarySearch(d, t-x);
            if(l < r){
                if(!mapS.containsKey(l)) mapS.put(l, new ArrayList<>());
                mapS.get(l).add(x);
                if(!mapE.containsKey(r)) mapE.put(r, new ArrayList<>());
                mapE.get(r).add(x);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            if(mapE.containsKey(i)) pq.removeAll(mapE.get(i));
            if(mapS.containsKey(i)) pq.addAll(mapS.get(i));
            if(!pq.isEmpty())ans[i] = pq.peek();
            else ans[i] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            sb.append(ans[i]).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();

    }

    public static int binarySearch(int[] array, int key){
        int ok = array.length;
        int ng = -1;
        while(1 < Math.abs(ok - ng)){
            int mid = (ok + ng) / 2;
            if(key <= array[mid]) ok = mid;
            else ng = mid;
        }
        return ok;
    }

}
