import java.util.*;

public class Main { 
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int dice = Integer.parseInt(sc.next());
      int winPoint = Integer.parseInt(sc.next());
      double percent = 0;
      k:for (int  x = 1; x <= dice; x++) {
        for (int y = 1; y<=winPoint; y++) {
          if (x*Math.pow(2, y) >= winPoint){
           percent +=  Math.pow(0.5, y)/dice;
            continue k;
          }
        }
      }
     System.out.println(percent);
    }
}