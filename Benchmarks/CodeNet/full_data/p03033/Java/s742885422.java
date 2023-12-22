import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        Event[] events = new Event[N*2];

        for(int i = 0; i<N; i++) {
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            events[i] = new Event(s-x, 1, x);
            events[i+N] = new Event(t-x, -1, x);
        }
        Arrays.sort(events, (ac,bc)->(ac.t-bc.t));
        int index = 0;
        for(int i = 0; i<Q; i++) {
            int d = Integer.parseInt(sc.next());;
            if(index < N*2) {
                while (events[index].t <= d) {
                    if (events[index].flag == 1) {
                        queue.add(events[index].x);
                    } else {
                        queue.remove(events[index].x);
                    }
                    index++;
                    if (index >= N * 2) break;
                }
            }
            int min = -1;
            if(queue.size()!=0) {
                min = queue.peek();
            }
            System.out.println(min);
        }
    }
}
class Event {
    int t;
    int flag;
    int x;
    public Event(int t, int flag, int x) {
        this.t = t;
        this.flag = flag;
        this.x = x;
    }
}