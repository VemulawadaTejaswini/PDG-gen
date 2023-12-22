import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Long> ll = new ArrayList<>();
    for (int i=0; i<n; i++) {
      ll.add(sc.nextLong());
    }
    sc.close();

    long lll = 0;
    int size = ll.size();
    for (int i=0; i<size; i++) {
      for (int j=i+1; j<size; j++) {
        lll += ll.get(i) ^ ll.get(j);
      }
    }
    System.out.println((int)(lll % (Math.pow(10, 9) + 7)));
  }
}