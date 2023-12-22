import java.util.*;
public class Main {
  static int maxSum = 0;

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      Deque<Integer> deque = new LinkedList<Integer>();
      for(int i = 0; i < n; i++)
        deque.offerLast(sc.nextInt());
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();
      dfs(deque, minHeap, k, 0, 0);
      System.out.println(maxSum);
  }

  public static void dfs(Deque<Integer> deque, PriorityQueue<Integer> minHeap, int k, int curK, int curSum) {
    if(curK == k) {
      maxSum = Math.max(maxSum, curSum);
      return;
    }
    if(!deque.isEmpty()) {
      int top = deque.pollFirst();
      minHeap.offer(top);
      dfs(deque, minHeap, k, curK + 1, curSum + top);
      deque.offerFirst(top);
      minHeap.remove(top);

      int tail = deque.pollLast();
      minHeap.offer(tail);
      dfs(deque, minHeap, k, curK + 1, curSum + tail);
      deque.offerLast(tail);
      minHeap.remove(tail);
    }
    if(minHeap.size() > 0) {
      int top = minHeap.poll();
      deque.offerFirst(top);
      dfs(deque, minHeap, k, curK + 1, curSum - top);
      deque.removeFirst();

      deque.offerLast(top);
      dfs(deque, minHeap, k, curK + 1, curSum - top);
      deque.removeLast();
    }
  }
}