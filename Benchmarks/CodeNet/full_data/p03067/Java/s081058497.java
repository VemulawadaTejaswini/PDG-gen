import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
    
    if ((a<c && b>c) || (a>c && b<c)) {
		System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
