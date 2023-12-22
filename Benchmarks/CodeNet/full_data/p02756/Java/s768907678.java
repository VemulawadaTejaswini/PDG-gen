import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LinkedList<String> array = new LinkedList<String>();
    array.add(sc.next());
    int n = sc.nextInt();
    int i = 0;
    while(n > i){
      i++;
      if(sc.nextInt() == 1){
		Collections.reverse(array);
      }
      else
      {
        if(sc.nextInt() == 1){
          array.addFirst(sc.next());
        }
        else
        {
          array.addLast(sc.next());
        }
      }
    }
    
    for (int j = 0 ; j < array.size() ; j++){
      String s = array.get(j);
      System.out.print(s);
    }
  }
}