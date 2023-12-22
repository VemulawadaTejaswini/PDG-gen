import java.util.*;
 
public class Main {
  	public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int[] array_p = new int[a];
      for (int i = 0; i < a; i++) {
        array_p[i] = sc.nextInt();
      }
      int[] array_q = new int[b];
      for (int j = 0; j < b; j++) {
        array_q[j] = sc.nextInt();
      }
      int[] array_r = new int[c];
      for (int k = 0; k < c; k++) {
        array_r[k] = sc.nextInt();
      }
      
      int[] array_x = new int[x];
      int[] array_y = new int[y];
      int[] array_eat = new int[x + y];
      int delicious = 0;
      
      Arrays.sort(array_p);
      Arrays.sort(array_q);
      Arrays.sort(array_r);
      for (int l = 0; l < x; l++) {
        array_x[l] = array_p[a-1-l];
      }
      for (int m = 0; m < y; m++) {
        array_y[m] = array_q[b-1-m];
      }
      System.arraycopy(array_x, 0, array_eat, 0, x);
      System.arraycopy(array_y, 0, array_eat, x, y);
      Arrays.sort(array_eat);
      
      for (int p = 0; p < array_eat.length; p++) {
        if ( (p + 1 <= c) && (array_eat[p] < array_r[c - (p + 1)]) ) {
          delicious += array_r[c - (p + 1)];
        } else {
          delicious += array_eat[p];
        }
      }
      System.out.println(delicious);
    }
}
