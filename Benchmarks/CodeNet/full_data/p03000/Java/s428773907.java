import java.io.*;

class Sample1501 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = new String(in.readLine()).split(" ", 0);
        String[] input2 = new String(in.readLine()).split(" ", 0);
      int count = 0;
      int sum = 0;
      int limit = Integer.parseInt(input1[1]);
      int n = Integer.parseInt(input1[0]);
      while(limit <= sum && count < n) {
        sum += Integer.parseInt(input2[count]);
        count += 1;
      }
      System.out.println("" + count);
    }
}