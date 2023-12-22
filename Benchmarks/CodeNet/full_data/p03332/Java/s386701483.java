import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),
        a = sc.nextInt(),
        b = sc.nextInt(),
        k = sc.nextInt();
    int count = 0;
    for(int red = 0; red <= n; red++){
      for(int green = 0; green <= n - red; green++){
        for(int blue = 0; blue <= n - red - green; blue++){
          if(a * red + (a + b) * green + b * blue == k)
            count++;
        }
      }
    }
    System.out.println(count % 998244353);
  }
}