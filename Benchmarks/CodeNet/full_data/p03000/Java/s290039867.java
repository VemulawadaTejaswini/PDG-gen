import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] l = new int[n + 1];
    int total = 0;
    int count = 0;

    for(int i = 1;i < n + 1;i++) {
      l[0] = 0;
      total += sc.nextInt();
      l[i] = total;
    }

    for(int i = 0;i < n + 1;i++) {
      if(l[i] > x) break;
      count++;
    }
    System.out.println(count);


  }

}
