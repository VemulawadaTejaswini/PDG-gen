import java.util.*;
class Main {
  Scanner sc = new Scanner(System.in);
  int n = Integer.parseInt(sc.next());
  int l = Integer.parseInt(sc.next());
  
  public static int appleToEat(int n, int l){
    int sum = 0;
    if (l > n) {
      for (int i = 1; i < n; i++) {
        sum += (l + i);
      }
      return sum;
    } else if (l*-1 > n) {
      for (int i = 0; i < n-1; i++) {
        sum += (l + i);
      }
      return sum;
    } else {
      for (int i = 0; i < n; i++) {
        sum += (l + i);
      }
      return sum;
    }
  
  public static void main(String args[]) {
    int result = appleToEat(n, l);
    System.out.println(result);
    
  }
  
}