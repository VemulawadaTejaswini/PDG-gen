import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int N = sc.nextInt(), K = sc.nextInt();
                        PriorityQueue<Integer> que = new PriorityQueue<Integer>((a,b) -> b - a);
                        Set<String>SS = new TreeSet<String>();
                        for (int i = 0; i < N; i++) {
                                SS.add(sc.next());
                        }
                        int[] chr = new int[26];
                        for (int i = 0; i < SS.size(); i++) {
                                chr[(new String(SS.toArray(new String[0])[i])).charAt(0) - 'A']++;
                        }
                        for (int i = 0; i < 26; i++) {
                                if (chr[i] != 0) {
                                        que.add(chr[i]);
                                }
                        }

                        int count = 0;
                        while (que.size() >= K) {
                                ArrayList<Integer> x = new ArrayList<Integer>();
                                for (int i = 0; i < K; i++) {
                                        int now = new Integer(que.poll());
                                        x.add(now);
                                }
                                count += x.get(K - 1);
                                for (int i = 0; i < K; i++) {
                                        if (x.get(i) - x.get(K - 1) != 0) {
                                                que.add(x.get(i) - x.get(K - 1));
                                        }
                                }
                        }
                        System.out.println(count);
                }
        }
}