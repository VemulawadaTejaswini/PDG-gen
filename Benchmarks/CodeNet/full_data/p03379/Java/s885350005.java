import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int temp = 0;
    List<Integer> list = new ArrayList<>();

    for(int i=0; i<N; i++){
      list.add(scan.nextInt());
    }

    for(int i=0; i<N; i++){
      temp = list.get(0);
      list.remove(0);
      Integer[] array = list.toArray(new Integer[N-1]);
      Arrays.sort(array);
      System.out.println(array[array.length/2]);
      list.add(temp);

    }

  }
}
