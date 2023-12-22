import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt(), B = s.nextInt(), X = s.nextInt(), Y = s.nextInt(), C = s.nextInt();
        Integer a[] = new Integer[X];
        Integer b[] = new Integer[Y];
        Integer c[] = new Integer[C];
        int sum = 0;
        for(int i = 0; i < X; i++) {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < Y; i++) {
            b[i] = s.nextInt();
        }
        for(int i = 0; i < C; i++) {
            c[i] = s.nextInt();
        }
        Arrays.sort(a, (x, y) -> y-x);
        Arrays.sort(b, (x, y) -> y-x);
        Arrays.sort(c, (x, y) -> y-x);
        PriorityQueue<Integer> q = new PriorityQueue<>((x,y) -> y-x);
        for(int i = 0; i < A; i++) {
            q.offer(a[i]);
        }
        for(int j = 0; j < B; j++) {
            q.offer(b[j]);
        }
        for(int k = 0; k < C; k++) {
            q.offer(c[k]);
        }
        int total = A+B;
        while(total-- > 0) {
            sum += q.poll();
        }
        System.out.println(sum);
    }
}