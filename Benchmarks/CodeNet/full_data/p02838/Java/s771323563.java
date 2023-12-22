import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    long[] nums = new long[N];
    long p = 1000000007;
    long ans = 0;
    int count = 0;
    long po = 1;
    
    for(int i = 0; i < N; i++){
      nums[i] = Long.parseLong(S[i]);
    }
    while(count != N){
      count = 0;
      long z = 0, o = 0;
      for(int i = 0; i < N; i++){
        if(nums[i] == 0){
          count++;
          z++;
          continue;
        }
        if(nums[i]%2 == 0){
          z++;
        }else{
          o++;
        }
        nums[i] /= 2;
      }
      ans += z*o*po;
      ans %= p;
      po *= 2;
    }
    System.out.println(ans);
  } 
}
