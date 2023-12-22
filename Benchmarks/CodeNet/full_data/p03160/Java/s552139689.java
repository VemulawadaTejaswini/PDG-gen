import java.util.*;
public class Main {
  
  static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    // get a integer
    int N = sc.nextInt();
    int[] input = new int[N];
    for(int i=0; i<N ; i++){
      input[i] = sc.nextInt();
    }
    System.out.println(minCost(N, input));
  }
  
  public static int minCost(int N, int[] array) {
    if (map.containsKey(N)) {
      return map.get(N);
    }
    if (N < 2) {
      map.put(1, 0);
      return 0;
    }
    if (N == 2) {
      int cost = Math.abs(array[0] - array[1]);
      map.put(2, cost);
      return cost;
    }
    int pre = Math.abs(array[N-1] - array[N-2]);
    int prepre = Math.abs(array[N-1] - array[N-3]);
    if (pre > prepre) {
      int cost = minCost(N-2, Arrays.copyOfRange(array, 0, N-2)) + prepre;
      map.put(N, cost);
      return cost;
  	} else {
      int cost = minCost(N-1, Arrays.copyOfRange(array, 0, N-1)) + pre;
      map.put(N, cost);
      return cost;
    }
  }
}