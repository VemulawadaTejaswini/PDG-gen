import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     Integer[] count = new Integer[N];
     for(int i = 0; i < N; i++) {
       int h = sc.nextInt();
       count[h - 1] = i;
     }
     System.out.println(
	 Arrays.stream(count)
       .map(v -> Integer.toString(v + 1))
       .collect(Collectors.joining(" "))
       );
  }
  
}
  