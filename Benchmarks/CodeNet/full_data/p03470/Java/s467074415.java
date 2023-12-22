import java.util.*;
 
public class Main {
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 
    int rimit = sc.nextInt();
 
    List<Integer> numList = new ArrayList<Integer>();
 
    for(int num = 1; num<=rimit ; num++){
      numList.add(sc.nextInt());
    }
 
    numList = numList.stream().distinct().collect(java.util.stream.Collectors.toList());
    
    System.out.println(numList.size());
  }
 
}