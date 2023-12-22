import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args){
    
    try {
      
      //local変数
      String jadge = "Yes";
      int    atack = 0;
      
      //標準入力受け取り
      Scanner scan            = new Scanner(System.in);
      ArrayList<Integer> strs = new ArrayList<Integer>();
      int bear   = Integer.parseInt(scan.next());
      int patern = Integer.parseInt(scan.next());
      
      while (scan.hasNext()){
      	strs.add(Integer.parseInt(scan.next()));
      }
      
      for (int i=0; i<strs.size(); i++) {
      	atack += strs.get(i);
      }
      
      if (bear>atack) {
      	jadge = "No";
      }

      System.out.println(jadge);
      
    } catch (Exception e) {
      
      System.out.println("error");

    }
  }
}
