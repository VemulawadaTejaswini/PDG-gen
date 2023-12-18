public class Main  {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flg = true;
    int count = 1;
    while(flg) {
      int n = sc.nextInt();
      if(n == 0) {
        break;
      }
      System.out.println("Case " + count + ": " + n);
      count++;
    }
    sc.close();
  }
}
