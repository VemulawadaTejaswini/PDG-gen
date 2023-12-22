import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int Alice = 0;
    int Bob = 0;
    boolean order = true;
    for(int i = n - 1; i >= 0; i--) {
      if(order) {
        Alice += arr[i];
        order = false;
      } else {
        Bob += arr[i];
        order = true;
      }
    }
    System.out.println(Alice - Bob);
  }
}