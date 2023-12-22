import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        int type2count = c.length;
        int n = sc.nextInt();
        
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < c.length; i++) {
            deq.offerLast(c[i] - '0');
        }
        
        int muki = 0;
        while (n-- > 0) {
            int type = sc.nextInt();
            
            if (type == 1) {
                muki = 1 - muki;
            } else {
                int type2 = sc.nextInt();
                type2count++;
                String s = sc.next();
                char cc = s.charAt(0);
                if (type2 == 1) {
                    if (muki == 0) {
                        deq.offerFirst(cc - '0');
                    } else {
                        deq.offerLast(cc - '0');
                    }
                } else {
                    if (muki == 1) {
                        deq.offerFirst(cc - '0');
                    } else {
                        deq.offerLast(cc - '0');
                    }
                }
            }
        }
        
        while (type2count-- > 0) {
            if (muki == 0) {
                int i = deq.pollFirst();
                char ccc = (char)(i + '0');
                System.out.print(ccc);
            } else {
                int i = deq.pollLast();
                char ccc = (char)(i + '0');
                System.out.print(ccc);
            }
        }
    }
}
