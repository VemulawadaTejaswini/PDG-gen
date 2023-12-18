public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] result = {a, b, c};
    Arrays.sort(result);
    System.out.println(result[0] + " " + result[1] + " " + result[2]);
  }
}
