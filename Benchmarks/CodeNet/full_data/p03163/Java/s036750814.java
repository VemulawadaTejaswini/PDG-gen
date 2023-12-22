import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    long[] v = new long[N];
    List<Map<Long, Long>> memo = new ArrayList<>();
    for(int i = 0; i <= N; i++){
      memo.add(new HashMap<Long, Long>());
    }
    memo.get(0).put(0L, 0L);
    for(int i = 0; i < N; i++){
      w[i] = sc.nextInt();
      v[i] = sc.nextLong();
    }
    System.out.println(solve(memo, w, v, W, N));
  }
  
  public static long solve(List<Map<Long, Long>> memo, int[] w, long[] v, int W, int N){
    for(int i = 0; i < N; i++){
      Map<Long, Long> map = memo.get(i);
      for(long key : map.keySet()){
        Map<Long, Long> nextMap = memo.get(i+1);
        if(key + w[i] <= W){
          long tmp = v[i] + map.get(key);;
          if(map.containsKey(key + w[i])){
            if(nextMap.containsKey(key + w[i])){
              tmp = tmp > nextMap.get(key + w[i]) ? tmp : nextMap.get(key + w[i]);
            }
          }
          nextMap.put(key + w[i], tmp);
        }
        long tmp = map.get(key);
        if(nextMap.containsKey(key)){
          tmp = nextMap.get(key) > tmp ? nextMap.get(key) : tmp;
        }
        nextMap.put(key, tmp);
      }
    }
    Map<Long, Long> map = memo.get(N);
    long max = -1;
    for(long key : map.keySet()){
      max = max > map.get(key) ? max : map.get(key);
    }
    return max;
  }
}