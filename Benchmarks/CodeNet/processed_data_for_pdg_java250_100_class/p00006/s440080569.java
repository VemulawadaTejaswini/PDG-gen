public class Main {
  public static void main(String[] args) throws IOException {
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      char[] charStr = br.readLine().toCharArray();
      StringBuilder rvsStr = new StringBuilder();
      for(int i=charStr.length-1; i>-1; i--)
        rvsStr.append(charStr[i]);
      System.out.println(rvsStr);
    }
  }
}
