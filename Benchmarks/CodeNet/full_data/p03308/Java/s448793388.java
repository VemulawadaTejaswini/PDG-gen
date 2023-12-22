import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Double> list = new ArrayList<>();
    Double n = sc.nextDouble();
    for(int i = 0; i < n; i++){
      list.add(sc.nextDouble());
    }
    
    Collections.sort(list);
    System.out.println((int)(list.get(list.size() - 1) - list.get(0)));
    return;
  }
}
