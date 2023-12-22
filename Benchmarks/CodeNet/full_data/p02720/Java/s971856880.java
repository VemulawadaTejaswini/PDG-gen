import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long result = execute(sc.nextInt());
        System.out.println(result);
    }

    public static long execute(int count) {
        Queue<Long> queue = new ArrayDeque<>();

        for(int i = 1; i <= 9 ; i++){
            queue.add(Long.valueOf(i));
        }

        long polled = 0;
        for(int i = 1 ; i <= count ; i++){
            polled = queue.poll();
            long nextAddBase = polled * 10 + polled % 10;
            if(polled % 10 != 0){
                queue.add(nextAddBase - 1);
            }
            queue.add(nextAddBase);
            if(polled % 10 != 9){
                queue.add(nextAddBase + 1);
            }
        }
        return polled;
    }
}
