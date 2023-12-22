import java.util.*;
import java.io.*;
import java.math.*;

public class Main{

  static Map<Integer, Map<Integer, Long>> memo = new HashMap<Integer, Map<Integer, Long>>();

  static long comb(int n, int r){
    if(n<r){
      return 0;
    }
    if(n==r){
      return 1;
    }
    if(r==0){
      return 1;
    }
    if(memo.containsKey(n)){
      if(memo.get(n).containsKey(r)){
        return memo.get(n).get(r);
      }
    }else{
      memo.put(n, new HashMap<Integer, Long>());
    }
    memo.get(n).put(r, (comb(n-1,r)+comb(n-1,r-1))%1000000007);
    return memo.get(n).get(r);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer n = Integer.parseInt(in.readLine());
    Integer[] a = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
    long cnt = 0;
    int deplLeft=0, deplRight=0;
    for(int i=0;i<n+1;i++){
      for(int j=i+1;j<n+1;j++){
        if(a[i]==a[j]){
          deplLeft = i;
          deplRight = j;
        }
      }
    }
    for(int i=0;i<n+1;i++){
        System.out.println(comb(n+1,i+1)-comb(deplLeft + (n - deplRight), i));
    }
  }
}
