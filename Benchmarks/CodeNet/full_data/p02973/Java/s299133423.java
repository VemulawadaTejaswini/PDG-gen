import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, max = 0, count = 0, temp, num, length;
    number_n = Integer.parseInt(sc.next());
    Queue<Integer> queue = new ArrayDeque<Integer>();
    for (i=0; i < number_n; i++) queue.add(Integer.parseInt(sc.next()));
    while(!queue.isEmpty()) {
      count++;
      length = queue.size();
      temp = queue.poll();
      for(i = 0; i < length - 1; i++) {
        num = queue.poll();
        if(temp >= num) queue.add(num);
        else temp = num;
      }
    }
    System.out.println(count);
  }
}
