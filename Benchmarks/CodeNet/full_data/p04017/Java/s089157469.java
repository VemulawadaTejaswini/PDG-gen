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
    TaskE solver = new TaskE();
    solver.solve(1, in, out);
    out.close();
  }
  
  static class TaskE {    
    int n, l, q, xi, ai, bi;
    int[] hotelsPos;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      hotelsPos = new int[n];
      for (int i = 0; i < n; ++i) {
        hotelsPos[i] = in.nextInt();
      }
      l = in.nextInt();
      q = in.nextInt();
      for (int i = 0; i < q; ++i) {
        ai = in.nextInt();
        bi = in.nextInt();
        int a = ai - 1;
        int b = bi - 1;
        if (a > b) {
          int aux = a;
          a = b;
          b = aux;
        }
        out.println(time(a, b));
      }
    }
    
    int time(int a, int b) {
      int ptr = a, ptr2 = a + 1, validPtr = a, days = 0;
      while (ptr < b && ptr2 < n) {
        if (hotelsPos[ptr2] - l <= hotelsPos[ptr]) {
          validPtr = ptr2;
        } else {
          ++days;
          ptr = validPtr;
          ptr2 = validPtr;
        }
        ++ptr2;
      }
      if (validPtr > a) {
        ++days;
      }
      return days;
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
