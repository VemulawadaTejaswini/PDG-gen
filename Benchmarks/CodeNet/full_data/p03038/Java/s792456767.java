import java.util.*;

public class Main {
    static long mod = 1000000007;

    static class Hand {
        int b, c;
        public Hand(int b, int c) {
            this.b = b;
            this.c = c;
        }
        public String toString() {
            return String.format("(%d, %d)", b, c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] lis = new Integer[n];
        Hand[] hands = new Hand[m];

        for (int i = 0; i < n; ++i) {
            lis[i] = sc.nextInt();
        }
        for (int i = 0; i < m; ++i) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            hands[i] = new Hand(b, c);
        }

        Arrays.sort(lis, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        Arrays.sort(hands, new Comparator<Hand>() {
            public int compare(Hand a, Hand b) {
                return b.c - a.c;
            }
        });

        long sum = 0;
        int i = 0;
        int j = 0;
        while (i < n) {
            if (j < m) {
                if (lis[i] >= hands[j].c) {
//                    System.out.println(String.format("add: lis[%d], %d => %d", i, lis[i], sum + lis[i]));
                    sum += lis[i++];
                } else {
                    for (int k = 0; k < hands[j].b && i < n; ++k) {
                        if (lis[i] >= hands[j].c) {
                            break;
                        }

                        sum += hands[j].c;
                        i += 1;
                    }
                    j++;
//                     long x = Math.min(n - i, hands[j].b);
// //                    System.out.println(String.format("add: lis[%d]: %d, hand[%d]:%s => %d", i, lis[i], j, hands[j].toString(), sum + hands[j].c * x));
//                     sum += hands[j].c * x;
//                     i += x;
//                     j++;
                }
            } else {
//                System.out.println(String.format("add: lis[%d], %d => %d", i, lis[i], sum + lis[i]));
                sum += lis[i++];
            }
        }
        System.out.println(sum);
    }
}
