import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();

    for( int i = 0; i < 5; i++) {
      int a = sc.nextInt();
      list.add(a);
    }
    int k = sc.nextInt();

    boolean cantConnect = false;
    for(int i = 0; i < list.size(); i++) {
      for(int j = i + 1; j < list.size(); j++){
        if (list.get(j) - list.get(i) > k) cantConnect = true; 
      }
    }

    System.out.println(cantConnect ? ":(" : "Yay!");

  }
}
