import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    int min = Integer.MAX_VALUE;
    int count;
    
    for (int i=0; i<n; i++) {
      count = 0;
      for (int j=0; j<i; j++) {
        if (str.charAt(j) == 'W') {
          count++;
        }
      }
      for (int j=i+i; j<n; j++) {
        if (str.charAt(j) == 'E') {
          count++;
        }
      }
      if (count < min) {
        min = count;
      }
    }
    System.out.println(min);
  }
}
