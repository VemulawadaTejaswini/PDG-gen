import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args){
    
    try {
      
      //標準入力受け取り
      Scanner scan            = new Scanner(System.in);
      ArrayList<Integer> strs = new ArrayList<Integer>();
      
      while (scan.hasNext()){
      	strs.add(scan.nextInt());
      }
      
      //変数へ代入
      int sub = strs.get(0); //科目
      int max = strs.get(1); //科目の最大点数
      int ave = strs.get(2); //目標平均点
      int sum = 0;           //合計点
      
      for (int i=3; i<strs.size(); i++) {
      	sum += strs.get(i);
      }
      
      //算出
      int point = ave*sub-sum;
      
      if (point < 0) {
        point = 0;
      }
      
      if (max < point) {
        point = -1;
      }
      
      System.out.println(point);
      
    } catch (Exception e) {
      
      System.out.println("error");

    }
  }
}
