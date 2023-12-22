import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        PriorityQueue<Integer> p = new PriorityQueue<>((i1, i2) -> i2 - i1);

        for (int i = 0; i < n; i++) p.add(sc.nextInt());

        int k = 0;
        while (!p.isEmpty()) {
            PriorityQueue<Integer> np = new PriorityQueue<>((i1, i2) -> i2 - i1);
            
            boolean f = true;
            while (!p.isEmpty()) {
                int m = p.poll();
                if (f) m -= a;
                else m -= b;
                
                if (m > 0) np.add(m);
                f = false;
            }
            
            p = np;
            k++;
        }
        
        System.out.println(k);
    }
}