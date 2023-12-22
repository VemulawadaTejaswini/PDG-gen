import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int[] arr = new int[n];
    long result = 0;
    for(int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }

    for(int i = 0; i < n-1; i++) {
      if(arr[i]%2==1 && arr[i+1]>0) {
        arr[i]--;
        arr[i+1]--;
        result++;
      }
    }

    for(int i = 0; i < n; i++) {
      result += arr[i]/2;
      arr[i] %= 2;
    }

    for(int i = 0; i < n-1; i++) {
      if(arr[i] == 1 && arr[i+1] == 1) {
        arr[i]--;
        arr[i+1]--;
        result++;
      }
    }

    System.out.println(result);
  }
}
