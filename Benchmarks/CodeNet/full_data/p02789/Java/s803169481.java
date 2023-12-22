import java.util.*;

public class Main {
 
  public static void main(String args[]) {
   
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] data = new int[length];
    for (int a=0; a<length; a++) {
       data[a] = sc.nextInt();
    }
   
    int count = 0;
    int i = 0;
    int min = 0;
    List<Integer> list = new ArrayList<Integer>(length);
    
    for (int b=0; b<length; b++) {
      i = data[b];
      list.add(i);

      min = list
        .stream()
        .mapToInt(v -> v)
        .min()
        .getAsInt();
            
      if (min >= i) {
        count++;
      }
    }
    
    System.out.println(count);
   
     
    
    
  }
}