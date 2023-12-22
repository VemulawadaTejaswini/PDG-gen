import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        long sum = 0;
        String ar[] = S.split("");
        Queue<String> queue = new ArrayDeque<>();
        List<String> list = new ArrayList<>();
        for (String s : ar)
            queue.add(s);
        
        int old = 0;
        while (queue.size() >0) {
            while (queue.size()>0 && (list.size()==0 || list.get(0).equals(queue.peek()))) {
                list.add(queue.poll());
            };
            if (">".equals(list.get(0))) {
                if (old<list.size()) {
                    sum -= old;
                } else {
                    sum -= list.size();
                }
                sum += func(list.size());
            } else {
                old = list.size();
                sum += func(list.size());
            }
            list.clear();
        };

        PrintWriter out = new PrintWriter(System.out);
        out.println(sum);
        out.flush();
    }
    private static int func(int n) {
        if (n==1) {
            return n;
        } else {
            return n+func(n-1);
        }
    }
}