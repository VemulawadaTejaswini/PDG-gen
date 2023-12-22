import java.util.*;

class Main{
    public static final int MOD = (int)1e9+7; 
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      int[] a = new int[n];
      int[] b = new int[n];
      long sum = 0;
      for(int i=0; i<n; i++){
        a[i] = Integer.parseInt(sc.next());
        if(i>0){
          b[i] = Math.max(0,a[i]-a[i-1]);
          sum += b[i];
        }else{
          sum += a[i];
        }
        
      }
      Arrays.sort(b);
      for(int i=0; i<k; i++){ 
          sum -= b[n-1-i];
      }
      System.out.println(sum);
    }
}
