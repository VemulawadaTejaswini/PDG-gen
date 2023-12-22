import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    
    int tr = n * a;
    int tx = b;

    if (tr > tx) {
	  System.out.println(tx);
    } else {
      System.out.println(tr);
    }
    
  }
}
