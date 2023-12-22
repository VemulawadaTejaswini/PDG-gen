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
    int M = scan.nextInt();
    int p[] = new int[M];
    String S[] = new String[M];
    int AC = 0;
    int WA = 0;
    if (M == 0) {
      System.out.println(0 + " " + 0);
      return;
    }
    for (int i = 0; i < M; i++) {
      p[i] = scan.nextInt();
      S[i] = scan.next();
    }
    if (S[0].equals("AC")) {
      AC += 1;
    }
    else{
      WA += 1;
    }
    for (int i = 1;i < M; i++) {
      if (S[i].equals("WA")) {
        if (p[i-1] == p[i] && S[i-1].equals("WA")) {
          WA += 1;
        }
        else if (p[i-1] != p[i]) {
          WA += 1;
        }
      }
      if (S[i].equals("AC")) {
        if (p[i-1] != p[i]) {
          AC += 1;
        }
        if (p[i-1] == p[i] && S[i-1].equals("WA")) {
          AC += 1;
        }
      }
    }
    System.out.println(AC + " " + WA);
  }
}