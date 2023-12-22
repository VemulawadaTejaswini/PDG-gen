import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(sc.nextInt());
    }
    Collections.sort(list);

    double ans = list.get(0);

    for(int i = 1; i < N; i++){
      ans = (ans + list.get(i)) / 2d;
    }

    System.out.println(ans);
  }
}
