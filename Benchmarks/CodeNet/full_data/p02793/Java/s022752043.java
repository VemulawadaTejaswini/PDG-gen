import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  static final long MOD = 1000000007;
  static final int A_MAX = 1000001;
  static boolean[] isPrime = new boolean[A_MAX+1];

  static long powMOD(long base, int n){
    long ret = 1;
    while(n > 0){
      if(n % 2 == 1) ret *= base;
      base *= base;
      base %= MOD;
      ret %= MOD;
      n /= 2;
    }
    return ret;
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    
    in = br.readLine().split(" ");
    int[] a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    br.close();

    int ma = 0;

    for(int i = 0; i < n; i++){
      if(a[i] > ma) ma = a[i];
    }

    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;

    int sqMAX = (int)Math.sqrt(ma);
    for(int i = 2; i <= sqMAX; i++){
      if(!isPrime[i]) continue;
      for(int j = i + i; j <= ma; j += i) isPrime[j] = false;
    }

    Set<Integer> primeList = new HashSet<>();
    primeList.add(2);

    for(int i = 3; i <= ma; i+=2){
      if(isPrime[i]) primeList.add(i);
    }

    HashMap<Integer, Integer>[] factor = new HashMap[n];
    for(int i = 0; i < n; i++){
      factor[i] = new HashMap<Integer, Integer>();
    }

    HashMap<Integer, Integer> tmpMap;
    for(int i = 0; i < n; i++){
      tmpMap = factor[i];
      int tmp = a[i];
      for(int p : primeList){
        if(tmp == 1) break;
        if(tmp % p != 0) continue;

        int pow = 0;
        while(tmp % p == 0){
          tmp /= p;
          pow++;
        }
        tmpMap.put(p, pow);
      }
    }

    Map<Integer, Integer> lcm = new HashMap<>();

    for(int i = 0; i < n; i++){
      tmpMap = factor[i];
      for(Map.Entry<Integer, Integer> e : tmpMap.entrySet()){
        int key = e.getKey();
        int val = e.getValue();
        if(lcm.containsKey(key)){
          lcm.put(key, Math.max(lcm.get(key), val));
        }else{
          lcm.put(key, val);
        }
      }
    }

    long ans = 0;

    for(int i = 0; i < n; i++){
      tmpMap = factor[i];
      long b = 1;
      for(Map.Entry<Integer, Integer> e : lcm.entrySet()){
        int key = e.getKey();
        int r = e.getValue();
        if(tmpMap.containsKey(key)) r -= tmpMap.get(key);
        b *= powMOD(key, r);
        b %= MOD;
      }
      ans += b;
      ans %= MOD;
    }

    System.out.println(ans);

  }
}