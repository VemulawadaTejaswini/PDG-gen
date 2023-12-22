import java.util.*;
import java.util.stream.Collectors;

public class Main{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int val  = scan.nextInt();
    int val2 = scan.nextInt();
    int val3 = scan.nextInt();
    
    List<Integer> prelist = new ArrayList<Integer>();
    prelist.add(val);
    prelist.add(val2);
    prelist.add(val3);
    
    
    
    //List<Integer> list = prelist.stream().distinct().collect(Collectors.toList());
    List<Integer> list = new ArrayList<Integer>(new HashSet<>(prelist));
    
    System.out.println(list.size());
    
    
    
    
    
  }
}