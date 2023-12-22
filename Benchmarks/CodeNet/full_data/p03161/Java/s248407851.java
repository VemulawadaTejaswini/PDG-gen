import java.util.*;
import java.lang.Math;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numStones = scanner.nextInt();
    int maxJumpDist = scanner.nextInt();

    if (numStones < 2 || numStones > 100000) {
      System.out.println("0");
      return;
    }

    ArrayList<Integer> heights = new ArrayList<>();
    for (int i = 0; i < numStones; i++) {
      heights.add(i, scanner.nextInt());
    }
    int cost = calcCost(numStones, maxJumpDist, heights);
  
    System.out.println(cost);
  }

  public static int calcCost(int N, int maxJump, ArrayList<Integer> heights) {
    ArrayList<Integer> dp = new ArrayList<>();

    dp.add(0, 0);
    dp.add(1, Math.abs(heights.get(1)-heights.get(0)));
    
    if (N == 2) {
      return dp.get(1);
    }

    for (int i = 2; i < N; i++) {
      ArrayList<Integer> jump = new ArrayList<>();
      for (int j = 1; j <= Math.min(maxJump, i); j++) {
        jump.add(j - 1, Math.abs(heights.get(i) - heights.get(i-j)));
      }
      int minCost = 100001; 
      for (int j = 1; j <= Math.min(maxJump, i); j++) {
        minCost = Math.min(minCost, jump.get(j - 1) + dp.get(i-j));
      }
      dp.add(i, minCost);
    }
    return dp.get(N-1);
  }
}