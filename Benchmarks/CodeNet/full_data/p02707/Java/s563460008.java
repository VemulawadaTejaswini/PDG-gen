package main.task163;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.stream.Collectors;

public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int N = in.nextInt();
      int[] list = new int[N];

      for (int i = 1; i < N; i++) {
        list[i] = in.nextInt();
      }

      for (int i = 1; i <= N; i++) {
        int res = 0;

        for (int l : list) {
          if (i == l) res++;
        }
        out.print(res + "\n");
      }
    }
}
