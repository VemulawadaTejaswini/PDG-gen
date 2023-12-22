import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int E = sc.nextInt();
      int F = sc.nextInt();
      Set<Integer> sugarSet = new HashSet<>();
      for(int i = 0; i <= F; i++) {
        for(int j = 0; j <= F; j++) {
          int s = i * c + j * d;
          if(s <= F)
            sugarSet.add(s);
        }
      }

      Set<Integer> waterSet = new HashSet<>();
      for(int i = 0; i <= F; i++) {
        for(int j = 0; j <= F; j++) {
          int w = i * 100 * a + j * 100 * b;
          if(w <= F)
            waterSet.add(w);
        }
      }

      double p = 0.0;
      int[] res = new int[2];
      for(int water : waterSet) {
        for(int sugar : sugarSet) {
          if(water / 100 * E < sugar || sugar + water > F) continue;
          double curP = sugar * 100.0 / (sugar + water);
          if(p < curP) {
            p = curP;
            res[0] = water;
            res[1] = sugar;
          }
        }
      }
      System.out.println((res[0] + res[1]) + " " + res[1]);
  }
}