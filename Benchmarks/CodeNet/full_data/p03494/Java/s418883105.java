import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[] arr = new int[];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    boolean even = true;
    while(even) {
      for(int i = 0; i < n; i++) {
        if(arr[i] % 2 == 1) {
          even = false;
          break;
        }
      }
      if(even) {
        count++;
      }
    }
    System.out.println(count);
  }
}