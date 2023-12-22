import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<Integer>( );
        
        q.add(P);
        q.add(Q);
        q.add(R);
        System.out.println(q.poll()+q.poll());
        
    }
}
