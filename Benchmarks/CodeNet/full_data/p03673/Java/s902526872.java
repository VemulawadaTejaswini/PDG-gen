import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    List<String> list = new ArrayList<>();
    boolean last = true;

    while(sc.hasNext()){
      if(last) {
        list.add(sc.next());
        last = false;
      }else{
        list.add(0,sc.next());
        last = true;

      }

    }

    if (n % 2 == 1){
      Collections.reverse(list);
    }
    System.out.println(String.join(" ", list));

  }
}
