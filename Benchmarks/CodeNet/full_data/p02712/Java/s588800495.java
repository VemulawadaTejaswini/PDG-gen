package main.java.tasks.task162;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.PrintWriter;

class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    B solver = new B();
    solver.solve(1, in, out);
    out.close();
  }
  static class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int N = in.nextInt();
      long res = 0;
      for(int i = 0; i < N; i++) {
        if(i % 3 != 0 && i % 5 != 0) res+=i;
      }
      out.print(res);
    }
  }
}




