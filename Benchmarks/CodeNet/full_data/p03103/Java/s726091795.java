import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        PriorityQueue<Long> kingakuq = new PriorityQueue<>();
        HashMap<Long, Long> dic = new HashMap<>();
        for (int i = 0; i < n; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            kingakuq.add(a);
            dic.put(a, b);
        }

        long sum = 0;
        while (true) {
            if (m == 0) break;
            long syou = kingakuq.poll();
            long hon = dic.get(syou);
            if (hon <= m) {
                m -= hon;
                sum += syou * hon;
            } else {
                sum += syou * m;
                m = 0;
            }
        }
        System.out.println(sum);
    }

}