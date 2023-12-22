import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int K = sc.nextInt();
        long x = 0;

        Deque<Long> arr = new ArrayDeque<>();

        if(K > 9) {
            for(int i = 1; i <= 9; i++) {
                arr.add((long)i);
            }
            for(int j = 1; j < K; j++) {
                x = arr.poll();
                if(x % 10 != 0) {
                    arr.add((x * 10) + (x % 10) - 1);
                }                
                arr.add((x * 10) + (x % 10));
                if(x % 10 != 9) {
                    arr.add((x * 10) + (x % 10) + 1);
                }
            }
            x = arr.poll();
            System.out.println(x);
        } else {
            System.out.println(K);
        }
    }
}
