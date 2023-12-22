import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n;i++) {
            int num = sc.nextInt();
            a[i] = num;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> y.num - x.num);
        for(int i = 0; i < n;i++) {
            int num = sc.nextInt();
            b[i] = num;
            pq.add(new Pair(i, num));
        }
        long count = 0;
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            Pair nextP = pq.peek();
            int index = p.index;
            if (p.num == a[index]) continue;
            int prevIndex = (index + n - 1) % n;
            int nextIndex = (index + 1) % n;
            int prev = b[prevIndex];
            int next = b[nextIndex];
            int total = prev + next;
            if (nextP == null) {
                int rem = p.num % total;
                if (rem == a[index]) {
                    count += p.num / total;
                    break;
                } else {
                    System.out.println("-1");
                    return;
                }
            }
            int x = p.num - nextP.num;
            int y = x / (total);
            int newNum = p.num -= ((y + 1) * total);
            if (newNum < a[index]) {
                System.out.println("-1");
                return;
            }
            if (newNum == a[index]) {
                b[index] = newNum;
                count += (y + 1);
                continue;
            }
            b[index] = newNum;
            pq.add(new Pair(index, newNum));
            count += (y + 1);
        }
        System.out.println(count);
    }

    static class Pair {
        int index;
        int num;
        Pair(int i, int n) {
            index = i;
            num = n;
        }
    }
}
