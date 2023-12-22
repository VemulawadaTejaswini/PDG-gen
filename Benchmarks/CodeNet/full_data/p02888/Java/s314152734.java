import java.util.*;

public class Main {
  public  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] l = new int[n];
    int count = 0;
    int tempSum = 0;
    for(int i = 0; i < n; i++) {
      l[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(l);
    for(int i = 0; i < n - 2; i++) {
      for(int j = i + 1; j < n - 1; j++) {
        tempSum = l[i] + l[j];
        for(int k = j + 1; k < n; k++) {
          if(tempSum > l[k]) count++;
          else break;
        }
      }
    }
    System.out.println(count);
  }
}
