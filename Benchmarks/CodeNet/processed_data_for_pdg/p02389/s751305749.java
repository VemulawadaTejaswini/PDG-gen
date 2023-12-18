public class Main { 
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int ans1 = a * b;
    int ans2 = 2 * (a + b);
    System.out.println(ans1 + " " + ans2);
  }
}
