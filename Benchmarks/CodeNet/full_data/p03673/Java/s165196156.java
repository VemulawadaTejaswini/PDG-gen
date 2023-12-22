import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(sc.nextInt());
        for(int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if(i % 2 == 0) {
                list.addFirst(num);
            } else {
                list.addLast(num);
            }
        }
        String ans = "";
        if(n % 2 == 0) {
            while(!list.isEmpty()) {
                ans += (list.pollLast() + " ");
            }
        } else {
            while(!list.isEmpty()) {
                ans += (list.pollFirst() + " ");
            }
        }
        System.out.println(ans.substring(0, ans.length()-1));
    }
}
