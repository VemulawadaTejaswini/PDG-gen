public class Main{
  public static void main(String[] args) {
    Scanner sin = new Scanner(System.in);
    int x = 0;
    int i = 1;
    while(0 != (x = sin.nextInt())){
      System.out.println("Case " + i +": " + x);
      i++;
    }
    sin.close();
  }
}
