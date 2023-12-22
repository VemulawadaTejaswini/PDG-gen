import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int count = 0;
    double per = 0;
    for (int i = 1;i <= N;i++) {
      if (i % 2 == 1) {
        count += 1;
      }
    }
    per = (double)count / N;
    System.out.println(per);
  }
}
