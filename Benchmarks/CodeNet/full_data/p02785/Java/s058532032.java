import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int k = sc.nextInt();
    LinkedList<Integer> h = new LinkedList<Integer>();
    for(int i = 0; i < n; i++){
      h.add(sc.nextInt());
    }
    Collections.sort(h,  Collections.reverseOrder());
    //char[] a = sc.nextLine().toCharArray();
    for(int i = 0; i < k; i++){
      h.poll();
    }
    double sum = 0;
    for(int i = 0; i < n-k; i++){
      sum += h.poll();
    }
    System.out.println(String.format("%.0f", sum));
  }
}