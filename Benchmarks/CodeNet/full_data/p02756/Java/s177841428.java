import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        
        ArrayDeque<String> deq = new ArrayDeque<>();
        deq.offerFirst(str);
        boolean reverse = false;
        while (q-- > 0) {
            int type1 = sc.nextInt();
            
            if (type1 == 1) {
                reverse = !reverse;
            } else {
                int type2 = sc.nextInt();
                String s = sc.next();
                
                if (type2 == 1) {
                    if (!reverse) {
                        deq.offerFirst(s);
                    } else {
                        deq.offerLast(s);
                    }
                } else {
                    if (reverse) {
                        deq.offerFirst(s);
                    } else {
                        deq.offerLast(s);
                    }
                }
            }
        }
        
        if (!reverse) {
            while (!deq.isEmpty()) {
                System.out.print(deq.pollFirst());
            }
        } else {
            while (!deq.isEmpty()) {
                System.out.print(deq.pollLast());
            }
        }
        System.out.println();
    }
}