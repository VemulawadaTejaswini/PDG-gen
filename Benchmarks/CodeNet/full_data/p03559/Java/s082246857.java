import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int[] a = new int[N];
      int[] b = new int[N];
      int[] c = new int[N];
      for(int i = 0; i<N; i++) a[i] = Integer.parseInt(sc.next());
      for(int i = 0; i<N; i++) b[i] = Integer.parseInt(sc.next());
      for(int i = 0; i<N; i++) c[i] = Integer.parseInt(sc.next());
      Arrays.sort(a);
      Arrays.sort(c);
      long res = 0;
      for(int i =0; i<N; i++){
          int cur = b[i];
          int ida = small(cur,a,N);
        //System.out.print("ida = "+ida+" ");
          if(ida!=-1) ida++;
          int idc = large(cur,c,N);
          //System.out.println("idc = "+idc);
          if(idc!=-1) idc = N-idc;
          res += idc*ida;
      }
      System.out.println(res);
  }
  static int small(int t, int[] ar, int n){
    if(ar[n-1]<t) return n-1;
      int lb = 0;
      int ub = n-1;
      while(lb+1<ub){
        int mid = (lb+ub)/2;
        if(ar[mid]<t && ar[mid+1]>=t) return mid;
        else if(ar[mid]<t) lb = mid+1;
        else ub = mid-1;
      }
      if(ar[lb]<t && ar[ub]>=t) return lb;
      if(ub<n-1 && ar[ub]<t && ar[ub+1]>=t) return ub;
      return -1;
  }
  static int large(int t, int[] ar, int n){
    if(ar[0]>t) return 0;
      int lb = 0;
      int ub = n-1;
      while(lb+1<ub){
        int mid = (lb+ub)/2;
        if(ar[mid]>t && ar[mid-1]<=t) return mid;
        else if(ar[mid]<=t) lb = mid+1;
        else ub = mid-1;
      }
      if(lb>0 && ar[lb]>t && ar[lb-1]<=t) return lb;
      if(ar[ub]>t && ar[lb]<=t) return ub;
      return -1;
  }
}