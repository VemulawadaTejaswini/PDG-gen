
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    // get a integer

    int N = sc.nextInt();
//    System.out.println(" integer is " + N);
    List<Integer> aList = new ArrayList<>();
    List<Integer> divideList = new ArrayList<>();
    for(int i = 0;i< N;i++){
      int input = sc.nextInt();
      aList.add(input);
    };
    aList.forEach((i) -> divideList.add(log2(i)));
    System.out.println(Collections.min(divideList));

  };

  public static int log2(int x) {
    if(x % 2 == 0){
      return (int) (Math.log(x) / Math.log(2));
    }else{
      return 0;
    }
  }
}
