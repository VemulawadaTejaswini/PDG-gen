import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();
    int[] k = new int[M];
    ArrayList<int[]> s = new ArrayList<>();

    for (int i = 0; i < M; i++) {
      k[i] = scn.nextInt();
      int[] s_forLine = new int[k[i]];
      for (int j = 0; j < k[i]; j++) {
        s_forLine[j] = scn.nextInt();
      }
      s.add(s_forLine);
    }

    int[] p = new int[M];
    for (int i = 0; i < M; i++) {
      p[i] = scn.nextInt();
    }

    ArrayList<ArrayList<Boolean>> switchState = new ArrayList<>();
    fullSearch(new ArrayList<>(), switchState, N);

    int validCombiCount = 0;
    for (ArrayList<Boolean> state : switchState) {
      int glowingBulbCount = 0;
      for (int bulbNum = 0; bulbNum < M; bulbNum++) {
        int onSwitchCount = 0;
        for (int switchNum = 0; switchNum < k[bulbNum]; switchNum++) {
          if (state.get(s.get(bulbNum)[switchNum] - 1)) {
            onSwitchCount++;
          }
        }
        if (onSwitchCount % 2 == p[bulbNum]) {
          glowingBulbCount++;
        }
      }
      if (glowingBulbCount == M) {
        validCombiCount++;
      }
    }

    System.out.println(validCombiCount);
  }

  public static void fullSearch(ArrayList<Boolean> state, ArrayList<ArrayList<Boolean>> allStates, int M) {
    if (M == 0) {
      allStates.add(state);
    } else {
      ArrayList<Boolean> state0 = (ArrayList<Boolean>) state.clone();
      state0.add(false);
      fullSearch(state0, allStates, M - 1);

      ArrayList<Boolean> state1 = (ArrayList<Boolean>) state.clone();
      state1.add(true);
      fullSearch(state1, allStates, M - 1);

    }
  }
}