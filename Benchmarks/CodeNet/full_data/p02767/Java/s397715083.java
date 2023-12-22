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
    Integer X[] = new Integer[N];
    int sum = 0;
    int summ = 0;
    for (int i = 0; i < N; i++) {
      X[i] = scan.nextInt();
      sum += X[i];
    }
    //真ん中を求める
    int HP = (sum / N);
    int HPP = (sum / N) + 1;
    sum = 0;
    //体力消耗量
    for (int i = 0; i < N ; i++) {
      sum += (X[i] - HP) * (X[i] - HP);
    }
    for (int i = 0; i < N ; i++) {
      summ += (X[i] - HPP) * (X[i] - HPP);
    }
    if (sum < summ) {
      System.out.println(sum);
    }
    else{
      System.out.println(summ);
    }
  }
}
