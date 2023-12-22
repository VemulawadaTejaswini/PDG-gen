import java.util.*;

public class Main {
  
  public int[] value;
  public int[] cost;
  
  public Main() {
  }
  
  private void getValue () {
    int total = 0;
    
    for (int i = 0; i < value.length; i++) {
      if (value[i] - cost[i] > 0 )
        total += value[i] - cost[i];
    }
    
    System.out.println(total);
  }
    
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    Main obj = new Main();
    int size = scan.nextInt();
    obj.value = new int[size];
    obj.cost = new int[size];
    
    for (int i = 0; i < size; i ++) {
      obj.value[i] = scan.nextInt();
    }
    
    for (int i = 0; i < size; i ++) {
      obj.cost[i] = scan.nextInt();
    }
    obj.getValue();
    
  }
}
