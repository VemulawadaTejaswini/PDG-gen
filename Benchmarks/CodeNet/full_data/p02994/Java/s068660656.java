import java.util.*;
class Main {
  static Scanner sc = new Scanner(System.in);
  static int n = Integer.parseInt(sc.next());
  static int l = Integer.parseInt(sc.next());
  
  public static int appleToEat(int n, int l){
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
        sum += (l + i);
    }
    
    if (l >= 0) {
      return sum - l;
    } else if (l*-1 >= n) {
      return sum - (l+n-1);
    } else {
      return sum;
    }
    
  }
  
  public static void main(String args[]) {
    int result = appleToEat(n, l);
    System.out.println(result);
    
  }
  
}