import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        Event[] events = new Event[N*2];
        ArrayList<Event> list = new ArrayList<>();

        for(int i = 0; i<N; i++) {
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
//            events[i] = new Event(s-x, 1, x);
//            events[i+N] = new Event(t-x, -1, x);
            list.add(new Event(s-x, 1, x));
            list.add(new Event(t-x, -1, x));
        }
        list.sort((ac,bc)->(ac.t-bc.t));
        int index = 0;
        for(int i = 0; i<Q; i++) {
            int d = Integer.parseInt(sc.next());

            if(index < N*2) {
                Event e = list.get(index);
                while (e.t <= d) {
                    if (e.flag == 1) {
                        queue.add(e.x);
                    } else {
                        queue.remove(e.x);
                    }
                    index++;
                    if (index >= N * 2) break;
                    e = list.get(index);
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