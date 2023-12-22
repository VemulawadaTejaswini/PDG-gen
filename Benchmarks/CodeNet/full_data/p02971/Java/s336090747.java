import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] list = new int[length];
    for (int i = 0; i < length; i++) {
      list[i] = sc.nextInt();
    }
    sc.close();

    for (int i = 0; i < length; i++) {
      ArrayList<Integer> tempList = new ArrayList<>();
      for (int num : list) {
        tempList.add(num);
      }
      tempList.remove(i);
      System.out.println(Collections.max(tempList));
    }
  }

}