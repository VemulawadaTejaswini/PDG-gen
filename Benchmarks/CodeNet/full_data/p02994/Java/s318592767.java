import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, number_n, number_l, temp, sum = 0;
    number_n = Integer.parseInt(sc.next());
    number_l = Integer.parseInt(sc.next());
    int[] score = new int[number_n];
    for(i = 0; i < number_n; i++) {
      score[i] = number_l + i;
      sum += score[i];
    }
    temp = Math.abs(score[0]);
    for(i = 0; i < number_n; i++) {
      if(Math.abs(score[i]) < temp) {
        temp = Math.abs(score[i]);
      }
    }
    System.out.println(sum - temp);
  }
}
