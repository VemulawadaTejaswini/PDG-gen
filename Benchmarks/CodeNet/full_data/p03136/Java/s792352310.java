import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
  public static void main(String... args) {
  	Scanner sc = new Scanner(System.in);
    int lines = new int[sc.nextInt()];
    
    for(int i = 0; sc.hasNext(); i++) {
      line[i] = sc.nextInt();
    }
    
    List<Integer> list = Arrays.asList(lines);
    
    if(Collections.max(list) >= sum(list)) {
    	System.out.println("Yes");
    } else {
    	System.out.println("No");
    }
  }
  
  public static int sum(List<Integer> value) {
    int sun = 0;
    
    for(int value : values) {
      sum += value;
    }
    
    return sum - Collections.max(values);
  }
}