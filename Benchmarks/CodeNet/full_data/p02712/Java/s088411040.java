package main.java.tasks.task162;

import java.util.Scanner;
import java.io.PrintWriter;

class Main {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int N = in.nextInt();
      long res = 0;
      for(int i = 0; i < N; i++) {
        if(i % 3 != 0 && i % 5 != 0) res+=i;
      }
      out.print(res);
    }
}
