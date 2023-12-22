import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    int count = 1;
    int start = 0;
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    
    int work = array[0];
    for (int i = 1; i < n;) {
      if ((work & array[i]) == 0) {
        work ^= array[i];
        i++;
        count += i - start;
      } else {
        work ^= array[start];
        start++;
      }
    }
    System.out.println(count);
  }
}
