/*
疑問点：x3, y3, x4, y4などの未知数を、未知数のまま計算する方法
連立方程式を解きたいけど、未知数を初期化しないで演算は無理だろうし。
*/
/*
解決法：いま正方形ができるという前提であるから、|x1-x2|と|y1-y2|を
正方形の残りの辺に割り当てるだけでよい
*/

import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int x1 = scan.nextInt();
    int y1 = scan.nextInt();
    int x2 = scan.nextInt();
    int y2 = scan.nextInt();
    int x3, y3, x4, y4 = 0;
    int dx = Math.abs(x1-x2);
    int dy = Math.abs(y1-y2);

    if(x1 < x2 && y2 < y1){
      x3 = x2 + dy;
      y3 = y2 + dx;
      x4 = x1 + dy;
      y4 = y1 + dx;
    }else if(x1 < x2 && y1 < y2){
      x3 = x2 - dy;
      y3 = y2 + dx;
      x4 = x1 - dy;
      y4 = y1 + dx;
    }else if(x2 < x1 && y1 < y2){
      x3 = x2 - dy;
      y3 = y2 - dx;
      x4 = x1 - dy;
      y4 = y1 - dx;
    }else{
      x3 = x2 + dy;
      y3 = y2 - dx;
      x4 = x1 + dy;
      y4 = y1 - dx;
    }


    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

  }
}