import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int min = 200000;
    int count = 0;
    for (int i=0; i<n; i++) {
      int current = sc.nextInt();
      if (min>=current) {
        count ++;
        min = current;
      }
    }

    System.out.println(count);
    
  }
}