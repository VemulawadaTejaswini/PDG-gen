import java.util.*;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=1;i<n;i++){
      a[i] = sc.nextInt();
    }
    
    int[] ans = new int[n];
    for(int i=0;i<n;i++){
      int k=0;
      for(int j=i+1;j<n;j++){
        if(a[j] == i+1)
          k += 1;
      }
      ans[i] = k;
    }
    
    for(int i=0;i<n;i++){
      System.out.println(ans[i]);
    }
  }
}