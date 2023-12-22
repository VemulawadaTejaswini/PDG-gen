import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int[] x = new int[n];
    for(int i = 0;i<n;i++){
      x[i] = sc.nextInt();
    }
    BigInteger count = BigInteger.valueOf(0);
    BigInteger one = BigInteger.valueOf(1);
    for(int i = 1;i < (1<<n);i++){
      List<Integer> li = new ArrayList<Integer>();
      for(int bit = 0;bit<n;bit++){// bit bit me ga hukumareru
        int bibi = i & (1<<bit);
        if(bibi != 0){
          li.add(x[bit]);
        }
      }

      int size = li.size();
      int total = 0;
      for(int j = 0;j < li.size();j++){
        total += li.get(j) * 10;
      }
      if(total / size == a * 10){
        count = count.add(one);
      }
    }
    System.out.println(count);
  }
}
