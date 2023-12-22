import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int[] line = new int[n];
    int i = 0;
    while(i < n){
      for(int j = i; j < Math.min(i + a, n); j++){
        line[j] = 1;
        for(int k = i + a; k < Math.min(i + a + b, n); k++){
          line[k] = 0;
        }
      }
      i += (a + b);
    }

    int ans = 0;
    for(int j = 0; j < n; j++){
      if(line[j] == 1){
        ans += 1;
      }
    }
    System.out.println(ans);
  }
}
