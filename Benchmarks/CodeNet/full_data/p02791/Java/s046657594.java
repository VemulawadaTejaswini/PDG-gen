import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] box = new int[n];
    for (int i=0; i<n; i++) {
      box[i] = sc.nextInt();
    }
    
    int ans = 1;
    for (int i=0; i<n-1; i++) {
      for (int j=0; j<i; j++) {
        if (box[i]>=box[j]) {
          ans++;
          break;
        }
      }
    }
    System.out.println(ans);
  }
}