import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int point = 4 * m;
    int[] item = new int[n];
    for (int i =0; i < n; i++) {
      item[i] = sc.nextInt();;
    }
    
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (item[i] >= point) {
        count++;
      }
    }
      
    if (count >= m) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}