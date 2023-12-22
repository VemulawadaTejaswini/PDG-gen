package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class ABC042DIrohaandaGrid {

  public void solve(int testNumber, Scanner in, PrintWriter out) {
    int h = in.nextInt();
    int w = in.nextInt();
    int a = in.nextInt();
    int b = in.nextInt();
    ModComb mc = new ModComb(200005);
    mc.makeFac();
    ModInt res = new ModInt(0);
    for (int i = 0; i < h - a; i++) {
      res = res.add(mc.combFac(b - 1 + i, i).mul(mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)));
    }
    out.println(res.toString());
  }
}
