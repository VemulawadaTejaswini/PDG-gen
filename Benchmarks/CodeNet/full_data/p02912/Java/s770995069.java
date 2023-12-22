import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i = 0;i < n;i++){
            queue.add(sc.nextInt());
        }

        for(int i = 0;i < m;i++){
            int price = queue.poll();
            queue.add(price/2);
        }

        long sum = 0;
        while(!queue.isEmpty()){
            sum += queue.poll();
        }
        System.out.println(sum);
    }
}