
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());

        int[] a = new int[t];
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t1-t0;
            }
        });
        for(int i=0;i<t;i++){
            a[i] = Integer.parseInt(sc.next());
            queue.add(a[i]);
        }
        Integer big,small;
        while(queue.size() > 1){
            big = queue.poll();
            small = queue.poll();
            if(big-small > 0)queue.add(big-small);
        }
        if(queue.size() > 0){
            System.out.println(queue.poll()-1);
        }else{
            System.out.println(0);
        }
        


    }
}
