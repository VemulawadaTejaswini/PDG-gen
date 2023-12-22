import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int[] ary = new int[3];
      for (int i = 0; i < ary.length; i++) {
        ary[i] = Integer.parseInt(sc.next());
      }
      System.out.println(ary[2] + " " + ary[0] + " " + ary[1]);
    }
}