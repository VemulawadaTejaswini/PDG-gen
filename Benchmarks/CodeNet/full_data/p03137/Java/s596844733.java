

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int pieces = cin.nextInt();
    int num = cin.nextInt();

    if (pieces >= num) {
      System.out.println(0);
      return;
    }

    int[] pos = new int[num];

    for (int i=0;i<num;i++) {
      pos[i] = cin.nextInt();
    }

    Arrays.sort(pos);
    int[] div = new int[num-1];
    for (int i=0;i<div.length;i++) {
      div[i] = pos[i+1]-pos[i];
    }
    Arrays.sort(div);
    int sum = pos[pos.length-1] - pos[0];
    for (int i=0;i<pieces-1;i++) {
      sum-=div[div.length-1-i];
    }
    System.out.println(sum);
//    Arrays.sort(div, (o1, o2) -> o1.val-o2.val);
//    Arrays.sort(div, Comparator.comparingInt(o -> o.val));
//    int count = 0;
//    while (count < pieces) {
//      int divPos = div[div.length-1-count].index;
//
//    }


  }

}