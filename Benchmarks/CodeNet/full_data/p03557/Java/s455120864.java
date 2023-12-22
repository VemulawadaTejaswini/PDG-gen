import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a[] = new long[n];
    long b[] = new long[n];
    long c[] = new long[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextLong();
    }
    for(int i = 0;i<n;i++){
      b[i] = sc.nextLong();
    }
    for(int i = 0;i<n;i++){
      c[i] = sc.nextLong();
    }

    Arrays.sort(a);
    Arrays.sort(c);
    long ans = 0;
    for(int i = 0;i<n;i++){
      long ab = BinarySearch1(a,b[i]) + 1;
      long bc = BinarySearch2(c,b[i]+1);
      ans += ab * (c.length - bc);
    }
    System.out.println(ans);
  }

  //ソートされた配列a[]と、探索目標のtarget
  public static long BinarySearch1(long a[] , long target){
    target = (int)target;
    int left = -1; //left と right を範囲外に設定することで、
    int right = a.length ; //条件の矛盾を解消している
    while(right - left > 1){
      int mid = left + (right - left) / 2;
      if(a[mid] >= target){
        right = mid;
      }else{
        left = mid;
      }
    }
    return (long)left;//条件に適している最も左、つまり小さいインデックスが返却される
  }
  public static long BinarySearch2(long a[] , long target){
    int left = -1; //left と right を範囲外に設定することで、
    int right = a.length ; //条件の矛盾を解消している
    while(right - left > 1){
      int mid = left + (right - left) / 2;
      if(a[mid] >= target){
        right = mid;
      }else{
        left = mid;
      }
    }
    return right;//条件に適している最も左、つまり小さいインデックスが返却される
  }
}
