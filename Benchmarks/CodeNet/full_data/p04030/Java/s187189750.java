

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Queue<String> q0 = new LinkedList<>();
        Queue<String> q1 = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                q0.add("0");
            } else if (s.charAt(i) == '1') {
                q1.add("1");
            } else {
                if (!q1.isEmpty()) {
                    q1.remove();
                } else if (q1.isEmpty() && (!q0.isEmpty())) {
                    q0.remove();
                }
            }
        }
        if (!q0.isEmpty()) {
            for (String a : q0) {
                System.out.print(a);
            }
        }
        if (!q1.isEmpty()) {
            for (String a : q1) {
                System.out.print(a);
            }
        }
        
        System.out.println();

    }

}
}
