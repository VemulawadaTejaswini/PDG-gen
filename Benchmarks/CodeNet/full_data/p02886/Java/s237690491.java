import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr = new int[n];
    int ans=0;
    for(int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++) {
      for (int j=i+1;j<n;j++) {
        ans+= arr[i] * arr[j];
      }
    }
    System.out.println(ans);
  }
}