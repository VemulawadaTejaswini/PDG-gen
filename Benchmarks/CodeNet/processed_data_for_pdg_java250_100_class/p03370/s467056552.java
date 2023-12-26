public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    String data[] = line.split(" ");
    int size = Integer.parseInt(data[0]);
    long total = Long.parseLong(data[1]);
    long sum = 0;
    long count = 0;
    long min = 1000;
    for (int i = 0; i < size; i ++) {
      line = br.readLine();
      long num = Long.parseLong(line);
      sum = sum + num;
      count = count + 1;
      if (num < min) min = num;
    }
    if (total != sum) {
      long rest = total - sum;
      count = count + (rest/min);
    }
    System.out.println(count);
  }
}
