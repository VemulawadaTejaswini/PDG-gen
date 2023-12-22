import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StringBuilder before = new StringBuilder();
        StringBuilder after = new StringBuilder();
        Deque<String> deq = new ArrayDeque<String>(100100);
        deq.add(scanner.nextLine());
        int query = scanner.nextInt();
        boolean reverse = false;
        for(int i = 0; i < query; i++) {
            if(scanner.nextInt() == 1) {
                reverse = !reverse;
            } else {
                if(!reverse) {
                    if(scanner.nextInt() == 1) {
                        deq.addFirst(scanner.next());
                    } else {
                        deq.addLast(scanner.next());
                    }
                } else {
                    if(scanner.nextInt() == 1) {
                        deq.addLast(scanner.next());
                    } else {
                        deq.addFirst(scanner.next());
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(reverse) {
            while(!deq.isEmpty()) {
                sb.append(deq.pollLast());
            }
        } else {
            while(!deq.isEmpty()) {
                sb.append(deq.pop());
            }
        }
        System.out.println(sb.toString());
        
    }
}