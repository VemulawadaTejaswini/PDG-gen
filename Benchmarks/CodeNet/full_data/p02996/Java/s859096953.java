import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      long cnt2 =0;
      int flg=0;
      long N = sc.nextLong();
      long[] a = new long[(int) N];
      long[] b = new long[(int) N];
      for (int i=0 ; i<N; i++) {
          a[i] = sc.nextLong();
          b[i] = sc.nextLong();
      }
      
      quick_sort(b,a);
      for(int i=0; i<N; i++) {
    	  cnt2 = cnt2 + a[i];

//    	  System.out.println("a=" + cnt2 + " b[i]=" + b[i] + " i=" + i );
    	  if (cnt2 > b[i]) {
    		  flg = 1;
    		  break;
    	  }
      }
      if(flg==1) {
    	  System.out.println("No");
      } else {
    	  System.out.println("Yes");
      }
  }
  
  static void quick_sort(long[] d, long[] d2) {
	  quick_sort(d,d2, 0, d.length-1);
  }

  // dのleftからrightまでの間のデータ列をクイックソートする
  static void quick_sort(long[] d, long[] d2, int left, int right) {
      if (left>=right) {
          return;
      }
      long p = d[(left+right)/2];
      int l = left, r = right;
      long tmp;
      while(l<=r) {
          while(d[l] < p) { l++; }
          while(d[r] > p) { r--; }
          if (l<=r) {
              tmp = d[l]; d[l] = d[r]; d[r] = tmp;
              tmp = d2[l]; d2[l] = d2[r]; d2[r] = tmp;
              l++; r--;
          }
      }
      quick_sort(d, d2, left, r);  // ピボットより左側をクイックソート
      quick_sort(d, d2, l, right); // ピボットより右側をクイックソート
  }
}