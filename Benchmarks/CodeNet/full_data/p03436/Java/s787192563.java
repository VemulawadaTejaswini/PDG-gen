import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		int wCount = 0;
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '.') {
		            wCount++;
		        }
		    }
		}
		int[][] counts = new int[h][w];
		ArrayDeque<Order> deq = new ArrayDeque<>();
		deq.add(new Order(0, 0, 1));
		while (deq.size() > 0) {
		    Order order = deq.poll();
		    if (counts[order.h][order.w] != 0) {
		        continue;
		    }
		    counts[order.h][order.w] = order.count;
		    if (order.h != 0 && field[order.h - 1][order.w] == '.') {
		        deq.add(new Order(order.h - 1, order.w, order.count + 1));
		    }
		    if (order.h != h - 1 && field[order.h + 1][order.w] == '.') {
		        deq.add(new Order(order.h + 1, order.w, order.count + 1));
		    }
		    if (order.w != 0 && field[order.h][order.w - 1] == '.') {
		        deq.add(new Order(order.h, order.w - 1, order.count + 1));
		    }
		    if (order.w != w- 1 && field[order.h][order.w + 1] == '.') {
		        deq.add(new Order(order.h, order.w + 1, order.count + 1));
		    }
		}
		if (counts[h - 1][w - 1] == 0) {
		    System.out.println(-1);
		} else {
		    System.out.println(wCount - counts[h - 1][w - 1]);
		}
   }
   
   static class Order {
       int h;
       int w;
       int count;
       
       public Order(int h, int w, int count) {
           this.h = h;
           this.w = w;
           this.count = count;
       }
   }
}


