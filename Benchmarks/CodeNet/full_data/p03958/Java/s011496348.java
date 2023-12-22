import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by yangyuyin on 16/10/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K =sc.nextInt();
        int T = sc.nextInt();
        int count=0;
        Comparator<Cake> order = new Comparator<Cake>() {
            @Override
            public int compare(Cake o1, Cake o2) {
                if(o2.count>o1.count) return 1;
                if(o2.count<o1.count) return -1;
                return 0;
            }
        };
        PriorityQueue<Cake> queue = new PriorityQueue<Cake>(order);
        for(int i=0;i<T;i++){
            Cake cake = new Cake(i,sc.nextInt());
            queue.add(cake);
        }
        Cake yesterday = queue.poll();
        for(int i=1;i<K;i++){
            if(queue.isEmpty()) {
                count++;
            }else {
                Cake today = queue.poll();
                yesterday.count--;
                if(yesterday.count!=0) {
                    queue.add(yesterday);
                }
                yesterday = today;
            }
        }
        System.out.print(count);
    }
    public static class Cake{
        int type;
        int count;
        Cake(int type, int count){
            this.type=type;
            this.count=count;
        }
    }
}
