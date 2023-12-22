 import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      String heights = scan.nextLine();
      String[] hstr = heights.split(" ");
      int[]hs = new int[hstr.length];
      for (int i = 0 ; i<hstr.length ; i++) {
        hs[i] = Integer.parseInt(hstr[i]);
      }
      
      scan.close();
      
      int[] res = new int[size];
      res[0] = 0;
      res[1] = Math.abs(hs[1]-hs[0]);
        
      for (int i = 2 ; i < size ; i++) {
        res[i] = Math.min(Math.abs(hs[i] - hs[i-1]),Math.abs(hs[i] - hs[i-2]));
      }
      
      System.out.print(res[size]);
    }
}