import java.io.*;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    
    try {
      //ローカル変数定義
      int page;		//書類のページ
      int paper;	//用紙
      
      //標準入力受け取り
      Scanner scan = new Scanner(System.in);
      String  N    = scan.next();
      
      page = Integer.parseInt(N);
      
      //用紙算出
      if (page % 2 == 0) {
        paper = page/2;
      } else {
        paper = page/2 + 1;
      }
      
      System.out.println(paper);
      
    } catch (Exception e) {
      
      System.out.println("error");

    }
  }
}
