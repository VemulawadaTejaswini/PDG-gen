import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      Arrays.sort(arr);
      Deque<Long> deque = new LinkedList<>();
      for(long a : arr)
        deque.addLast(a);

      List<String> res = new ArrayList<>();
      while(deque.size() > 2) {
        Long num1 = deque.pollFirst();
        Long num2 = deque.pollLast();
        deque.addFirst(num1 - num2);
        res.add(num1 + " " + num2);
      }
      Long num1 = deque.pollFirst();
      Long num2 = deque.pollLast();
      res.add(num2 + " " + num1);
      System.out.println(num2 - num1);
      for(String str : res)
        System.out.println(str);
  }
}