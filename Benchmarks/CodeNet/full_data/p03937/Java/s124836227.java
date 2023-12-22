// -*- coding: utf-8 -*-
//import java.awt.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    InputStream inputStream;
    if (args.length > 0 && args[0].equals("devTesting")) {
      try {
        inputStream = new FileInputStream(args[1]);
      } catch(FileNotFoundException e) {
        throw new RuntimeException(e);
      }
    } else {
      inputStream = System.in;
    }
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    TaskA solver = new TaskA();
    solver.solve(1, in, out);
    out.close();
  }
  
  static class TaskA {    
    int h, w;
    String[] table;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      h = in.nextInt();
      w = in.nextInt();
      table = new String[h];
      for (int i = 0; i < h; ++i)
        table[i] = in.next();
      int cnt = 0;
      for (int i = 0; i < h; ++i)
        for (int j = 0; j < w; ++j)
          if (table[i].charAt(j) == '#')
            ++cnt;
      BitSet vis = new BitSet();
      dfs(0, 0, vis);
      out.println(cnt == vis.cardinality() ? "Possible" : "Impossible");
    }
    
    void dfs(int x, int y, BitSet vis) {
      vis.set(hash(x, y));
      boolean done = false;
      if (iswithin(x + 1, y) && table[y].charAt(x + 1) == '#') {
        dfs(x + 1, y, vis);
        done = true;
      }
      if (!done && iswithin(x, y + 1) && table[y + 1].charAt(x) == '#')
        dfs(x, y + 1, vis);
    }
    
    boolean iswithin(int x, int y) {
      return x >= 0 && x < w && y >= 0 && y < h;
    }
    
    int hash(int x, int y) {
      return y * w + x;
    }
    
  }
      
  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream));
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }
    
    public String nextLine() {
      try {
        return reader.readLine();
      } catch(IOException e) {
        throw new RuntimeException(e);
      }
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
    
    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public boolean hasInput() {
      try {
        if (tokenizer != null && tokenizer.hasMoreTokens()) {
          return true;
        }
        reader.mark(1);
        int ch = reader.read();
        if (ch != -1) {
          reader.reset();
          return true;
        }
        return false;
      } catch(IOException e) {
        throw new RuntimeException(e);
      }
    }
    
  }
}
