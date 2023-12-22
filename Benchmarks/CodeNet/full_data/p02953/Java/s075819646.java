import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] a = new long[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextLong();
    }

    int range = 0;
    for(int j=0;j<n-1;j++){
      if (a[j+1] >= a[j] + 1){
        a[j+1] -= 1;
      }
      else{
        if (a[j+1] != a[j]){
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");

  }
}
