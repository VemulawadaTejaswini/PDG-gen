import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        long ans = 0L;
        for (int i = 0; i <= Math.min(n, k); i++) {
            ArrayDeque<Integer> l = new ArrayDeque<>();
            ArrayDeque<Integer> r = new ArrayDeque<>();
            PriorityQueue<Integer> m = new PriorityQueue<>();
            long tmp = 0L;
            for (int j = 0; j < i; j++) {
                tmp += v[j];
                l.addFirst(v[j]);
                if(v[j] < 0) m.add(v[j]);
            }
            for (int j = n-1; j > n -1 - (Math.min(n, k)-i); j--) {
                tmp += v[j];
                r.addFirst(v[j]);
                if(v[j] < 0) m.add(v[j]);
            }
            int cnt = 0;
            for (int j = 0; j < Math.min(n, k); j++) {
                if(m.isEmpty()) break;
                if(l.isEmpty() && r.isEmpty()) break;
                boolean changed = false;
                if(!l.isEmpty() &&(r.isEmpty() || l.peek() < r.peek())){
                    if(l.peek() < 0){
                        if(m.remove(l.peek())) tmp -= l.pop();
                        else l.pop();
                        cnt++;
                        changed = true;
                    }else if(0 < cnt){
                        tmp -= m.poll();
                        cnt--;
                        changed = true;
                    }else if(l.peek() < -m.peek()){
                        tmp -= l.pop();
                        tmp -= m.poll();
                        changed = true;
                    }
                }else {
                    if(r.peek() < 0){
                        if(m.remove(r.peek())) tmp -= r.pop();
                        else r.pop();
                        cnt++;
                        changed = true;
                    }else if(0 < cnt){
                        tmp -= m.poll();
                        cnt--;
                        changed = true;
                    }else if(r.peek() < -m.peek()){
                        tmp -= r.pop();
                        tmp -= m.poll();
                        changed = true;
                    }
                }
                if(!changed) break;
            }
            if(ans < tmp) ans = tmp;
        }

        System.out.println(ans);
        sc.close();

    }

}
