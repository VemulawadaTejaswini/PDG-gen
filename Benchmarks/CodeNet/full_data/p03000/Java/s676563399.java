import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int count = 0;
    int ans = 0;
    int[] arr = new int[N+1];
    arr[0]=0;
    for(int i=1;i<=N;++i) {
      int temp = sc.nextInt();
      count = count + temp;
      arr[i] = count;
    }
    for(int j=0;j<arr.length-1;j++) {
      if(arr[j]<=X) {
        ans++;
      }
    }
    System.out.println(ans);



    }


  }
