import java.util.*;

public class Main {
  
  private int[] value;
  private int[] cost;
  
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
    this.value = new int[size];
    this.cost = new int[size];
    
    obj.getValue();
    
  }
}
