import java.util.*;
 
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int [] a = new int[3];
    for (int i = 0; i < 3; i++) {
      a[i] = sc.nextInt();
    }
    int count = 0;
 
    for(int i = 0 ; i < 3 ; i++){
      int x = i;
      for(int j = x + 1 ; j < 3 ; j++){
        if( a[i] != a[j] ){
          count ++;
        }
      }
    }
 
    System.out.println(count);
  }
}