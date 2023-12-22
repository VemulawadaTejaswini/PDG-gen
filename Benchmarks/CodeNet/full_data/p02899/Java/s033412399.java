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
    int A[] = new int[N];
    int stu[] = new int[N];
    int count = 0;
    for (int i = 0;i < N;i++) {
      A[i] = scan.nextInt();
      stu[i] = i + 1;
    }
    for (int j = 0;j < N;j++) {
      for (int i = 0;i < N;i++) {
        if (A[i] == j + 1) {
          stu[j] = i + 1;    
        }
      }
    }
    for (int i = 0;i < N;i++) {
      System.out.print(stu[i] + " ");
    }
  }
}
