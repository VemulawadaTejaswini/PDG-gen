import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        PriorityQueue<Apple> queue = new PriorityQueue<>();
        for (int i = 0; i < a; i++) {
            queue.add(new Apple(0, sc.nextInt()));
        }
        for (int i = 0; i < b; i++) {
            queue.add(new Apple(1, sc.nextInt()));
        }
        for (int i = 0; i < c; i++) {
            queue.add(new Apple(2, sc.nextInt()));
        }
        int z = x + y;
        long total = 0;
        while (z > 0) {
            Apple ap = queue.poll();
            if (ap.type == 0) {
                if (x <= 0) {
                    continue;
                }
                x--;
            } else if (ap.type == 1) {
                if (y <= 0) {
                    continue;
                }
                y--;
            }
            z--;
            total += ap.value;
        } 
        System.out.println(total);
    }
    
    static class Apple implements Comparable<Apple> {
        int type;
        int value;
        
        public Apple(int type, int value) {
            this.type = type;
            this.value = value;
        }
        
        public int compareTo(Apple another) {
            return another.value - value;
        }
    }
}