/*
全部でいくらかかるかは、各ピザの組み合わせによって決まる（値段が与えられているため）から、
単純に枚数の組み合わせを考えればよかった（枚数の樹形図書けばわかりやすかった）
*/

import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();

    long ans = Long.MAX_VALUE;

    for(int k = 0; k < 10000; k++){
      long sum = c*2*k + a*Math.max(x-k, 0) + b*Math.max(y-k, 0);
      ans = Math.min(ans, sum);
    }

    System.out.println(ans);
  }
}
