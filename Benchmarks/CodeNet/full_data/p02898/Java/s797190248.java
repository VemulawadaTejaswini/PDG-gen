import java.util.*;

class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int counter = 0;
    for (int i = 0; i < N; ++i) {
      int temp = Integer.parseInt(sc.next());
      if (K <= temp) counter++;
    }
    
    System.out.println(counter);
  
  }
}