import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main (String[] args) {
    ArrayList<Integer> perfectPowers = new ArrayList<Integer>();
    
    perfectPowers.add(1);
    
    for (int b = 2; b <= 1000; ++b) {
      int perfectPower = b * b;

      while (perfectPower <= 1000) {
        perfectPowers.add(perfectPower);
        perfectPower *= b;
      }
    }

    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int X = in.nextInt();
      int maxPerfectPower = Integer.MIN_VALUE;
      
      for (int i = 0; i < perfectPowers.size(); ++i) {
        if (perfectPowers.get(i) <= X) {
          maxPerfectPower = Math.max(maxPerfectPower, perfectPowers.get(i));
        }
      }

      System.out.println(maxPerfectPower);
    }
  }
}