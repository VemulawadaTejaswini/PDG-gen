public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] ab = line.split(" ");
    int a = Integer.parseInt(ab[0]);
    int b = Integer.parseInt(ab[1]);
    if(a < b) {
      System.out.println("a < b");
    }else if(a > b) {
      System.out.println("a > b");
    }else {
      System.out.println("a == b");
    }
  }
}
