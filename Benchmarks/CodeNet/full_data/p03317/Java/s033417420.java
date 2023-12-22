import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    
    str = br.readLine().split(" ");
    
    double count;
    if(n - k > 0) {
      count = Math.ceil((double)(n - k) / (k - 1));
    }
    else {
      count = 0;
    }
    
    System.out.println(Math.round(count) + 1);
  }
}
