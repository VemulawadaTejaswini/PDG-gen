import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int train = Integer.parseInt(strs[0]);
    int bus = Integer.parseInt(strs[1]);
    
    System.out.println(train + bus / 2);
  }
}