import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    long[] nums = new long[6];
    for(int i = 0;i < 6;i++){
      nums[i] = sc.nextLong();
    }
    long n = nums[0];
    long k = n;
    for(int i = 1;i < 6;i++){
      k = Math.min(k,nums[i]);
    }
    if(k >= n){
    System.out.println(5);
    }
    long j = 1;
    while(n - k * j >= 0){
    	j++;
    }
    System.out.println(4 + j);
  }
}