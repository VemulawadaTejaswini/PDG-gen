import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int N = scn.nextInt();
    int[] Nmonster = new int[N + 1];

    for (int i = 0; i < N + 1; i++) {
      Nmonster[i] = scn.nextInt();
    }
    int Nbeaten = 0;
    for (int i = 0; i < N; i++) {
      int Nbeatble = scn.nextInt();
      if (Nbeatble >= Nmonster[i] + Nmonster[i + 1]) {
        Nbeaten += Nmonster[i] + Nmonster[i + 1];
        Nmonster[i] = 0;
        Nmonster[i + 1] = 0;
      } else if (Nbeatble <= Nmonster[i]) {
        Nbeaten += Nbeatble;
        Nmonster[i] -= Nbeatble;
        Nbeatble = 0;
      } else {
        int diff = Nbeatble - Nmonster[i];
        Nmonster[i + 1] -= diff;
        Nbeaten += diff;
        Nbeatble -= diff;

        Nmonster[i] = 0;
        Nbeaten += Nbeatble;
        Nbeatble = 0;

      }

    }

    System.out.println(Nbeaten);

  }
}