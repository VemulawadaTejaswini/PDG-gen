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
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
  }
  
  static class TaskB {    
    long x, n;
    long[] a;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();        
      x = in.nextInt();
      a = new long[(int) n];
      for (int i = 0; i < n; ++i)
        a[i] = in.nextInt();
      long[][] table = new long[(int) n][(int) n];
      for (long[] i : table)
        Arrays.fill(i, Long.MAX_VALUE / 2);
      for (int i = 0; i < n; ++i) {
        table[i][0] = a[i];
        long best = table[i][0];
        for (int j = 1; j < n; ++j) {
          long diff = (i - j + n) % n;
          table[i][j] = Math.min(table[i][j - 1], Math.min(table[i][j], a[(int) diff]));
        }
      }
      long ans = Long.MAX_VALUE / 2;
      for (int k = 0; k < n; ++k) {
        long test = k * x;
        for (int i = 0; i < n; ++i) {
          test += table[i][k];
        }
        ans = Math.min(ans, test);
      }
      out.println(ans);
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
