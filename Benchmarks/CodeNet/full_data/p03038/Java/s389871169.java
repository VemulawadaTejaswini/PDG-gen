import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    long ans = 0;
    
    for(int i = 0; i<n; i++){
      a[i] = sc.nextInt();
    }

    for(int i=0; i<m; i++){
      int t = 0;
      int cnt = 0;
      int b = sc.nextInt();
      int c = sc.nextInt();
      while(t<b || cnt<n){
        if(a[t]<c){
          a[t]=c;
          t++;
        }
        cnt++;
      }
      for(int j=0; j<n; j++){
        System.out.print(a[j]+" ");
      }
      System.out.println();
    }

    for(int i=0; i<n; i++){
      ans += a[i];
    }
	System.out.println(ans);
  }
}