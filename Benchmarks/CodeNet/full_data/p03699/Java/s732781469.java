import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            sum += s;
            if(s % 10 != 0) pq.add(s);
        }
        while(sum % 10 == 0){
            if(pq.isEmpty()){
                sum = 0;
                break;
            }
            sum -= pq.poll();
        }

        System.out.println(sum);
        sc.close();
    }

}
