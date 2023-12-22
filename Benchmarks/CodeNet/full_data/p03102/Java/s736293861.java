import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, number_m, number_c, i, j, temp_sum, count = 0;
    number_n = Integer.parseInt(sc.next());
    number_m = Integer.parseInt(sc.next());
    number_c = Integer.parseInt(sc.next());
    int[] array_b = new int[number_m];
    int[] array_a = new int[number_m];
    for(i = 0; i < number_m; i++) array_b[i] = Integer.parseInt(sc.next());
    for(i = 0; i < number_n; i++) {
      temp_sum = number_c;
      for(j = 0; j < number_m; j++) {
        array_a[j] = Integer.parseInt(sc.next());
        temp_sum += array_a[j] * array_b[j];
      }
      if(temp_sum > 0) count++;
    }
    System.out.println(count);
  }
}
