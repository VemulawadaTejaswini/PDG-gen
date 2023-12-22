import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int i, sum = 0, min_r = 10;
      	int[] time = new int[5];
      	for(i = 0; i < 5; i++) {
          time[i] = Integer.parseInt(sc.next());
          if(time[i] % 10 == 0) {
            sum += time[i];
          } else {
          	sum += time[i] + (10 - (time[i] % 10));
            if(min_r > time[i] % 10) min_r = time[i] % 10;
          }
        }
      	System.out.println(sum - (10 - min_r));
    }
}