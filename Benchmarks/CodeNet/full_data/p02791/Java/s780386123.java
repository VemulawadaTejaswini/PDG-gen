

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;

    public static void solve() throws IOException {
        int n = nextInt();
        Integer[] arr = nextArray(n);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int res= 0;
        for(int num : arr){
            if(pq.isEmpty() || pq.peek() >= num)res++;
            pq.add(num);
        }

        System.out.println(res);

    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(in.readLine().trim());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(in.readLine().trim());
    }

    static Integer[] nextArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        return tmp;
    }

}

