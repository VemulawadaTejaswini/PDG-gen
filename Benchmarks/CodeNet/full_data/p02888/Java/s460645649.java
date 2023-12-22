import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];

    for(int i = 0; i < n; i++){
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);

    int count = 0;
    for(int a = 0; a < n; a++){
      for(int b = a + 1; b < n; b++){
        for(int c = b + 1; c < n; c++){
          if( l[a] < l[b] + l[c] &&
              l[b] < l[a] + l[c] &&
              l[c] < l[a] + l[b]
          ){
            count++;
          }
        }
      }
    }

    System.out.println(count);
  }
}
