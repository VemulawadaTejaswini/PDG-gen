import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
    }

    int count = 0;
    int sum = 0;
    for (int j=0;j<n-1;j++){
      if (a[j] >= a[j+1]){
        sum += 1;
      }
      else{
        if (count < sum){
          count = sum;
        }
        sum = 0;
      }
    }
    if (sum > count){
      count = sum;
    }
    System.out.println(count);

  }
}
