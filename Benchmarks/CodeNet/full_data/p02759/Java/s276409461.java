import java.io.*;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    
    try {
      
      //標準入力受け取り
      Scanner scan = new Scanner(System.in);
      double page = Integer.parseInt(scan.next());
      
      //用紙算出
      System.out.println((int) Math.ceil(page / 2));
      
    } catch (Exception e) {
      
      System.out.println("error");

    }
  }
}