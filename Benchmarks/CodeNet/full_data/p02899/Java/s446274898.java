import java.io.*;
import java.util.*;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer a[] = new Integer[n + 100];
    Integer rev[] = new Integer[n + 100];
    for (int i = 1; i <= n; i++) {
      a[i]  = sc.nextInt();
      rev[a[i]] = i;
    }
    for(int i = 1; i <= n; i++){
      System.out.println(rev[i]);
    }


  }
}
