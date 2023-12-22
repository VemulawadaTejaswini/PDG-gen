//package AtCoder.Nekkei;

import java.io.*;
import java.util.*;
class Main {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        pair[] arr = new pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new pair(s.nextInt(), s.nextInt());
        }

        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        long first = 0;
        long sec = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                first += arr[i].first;
            } else {
                sec += arr[i].second;
            }
        }

        System.out.println(first - sec);

   }

    private static class pair implements Comparable<pair> {
        long first;
        long second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object obj) {
            pair p = (pair) obj;
            return this.first == p.first && this.second == p.second;
        }

        @Override
        public String toString() {
            return this.first + " " + this.second;
        }

        @Override
        public int compareTo(pair o) {
            if(this.first == o.first){
                return Long.compare(this.second, o.second);
            }
            return Long.compare(o.first, this.first);
        }
    }
}