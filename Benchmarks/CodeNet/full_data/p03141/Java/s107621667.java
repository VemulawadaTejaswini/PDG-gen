import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // |A_i -B_i|が大きい順番に並べる
        // 同じ場合は、A_i, B_i のどちらかが大きい順番に並べる
        PriorityQueue<Entry> pq = new PriorityQueue<Entry>(N, new EntryComparator());
        for (int i = 0; i < N; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            pq.add(new Entry(a, b));
        }

        //PriorityQueue<Entry> pq_tmp = new PriorityQueue<Entry>(pq);
        //while(!pq_tmp.isEmpty()){
        //    Entry entry = pq_tmp.poll();
        //    out.println(entry.A+","+entry.B);
        //}

        long A_count = 0;
        long B_count = 0;

        while(pq.size() > 0){
            Entry entry = pq.poll();
            A_count += entry.A;

            if(pq.size() == 0) break;

            entry = pq.poll();
            B_count += entry.B;
        }

        out.println(A_count - B_count);
    }

    static class EntryComparator implements Comparator<Entry> {
        @Override
        public int compare(Entry t1, Entry t2) {
            if (t1.sum < t2.sum){
                 return 1;
             } else if (t1.sum == t2.sum){
                 return 0;
             }
            return -1;
        }
    }

    static class Entry {
        public long A;
        public long B;
        public long sum;

        public Entry(long A, long B){
            this.A = A;
            this.B = B;
            this.sum = this.A + this.B;
        }
    }
}