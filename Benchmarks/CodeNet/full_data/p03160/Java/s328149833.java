import java.util.*;
import java.lang.Math;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numStones = scanner.nextInt();

    if (numStones < 2 || numStones > 100000) {
      System.out.println("0");
      return;
    }

    ArrayList<Integer> heights = new ArrayList<>();
    for (int i = 0; i < numStones; i++) {
      heights.add(i, scanner.nextInt());
    }
    int cost = calcCost(numStones, heights);
  
    System.out.println(cost);
  }

  public static int calcCost(int N, ArrayList<Integer> heights) {
    ArrayList<Integer> dp = new ArrayList<>();

    dp.add(0, 0);
    dp.add(1, Math.abs(heights.get(1)-heights.get(0)));
    
    if (N == 2) {
      return dp.get(1);
    }

    int cost;
    int firstJump;
    int secondJump;
    for (int i = 2; i < N; i++) {
      firstJump = Math.abs(heights.get(i)-heights.get(i-1));
      secondJump = Math.abs(heights.get(i)-heights.get(i-2));
      cost = Math.min(firstJump + dp.get(i-1), secondJump + dp.get(i-2));
      dp.add(i, cost);
    }
    return dp.get(N-1);
  }
}