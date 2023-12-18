public class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int a = stdin.nextInt();
    int b = stdin.nextInt();
    int c = stdin.nextInt();
    int[] arr = { a, b, c };
    Arrays.sort(arr);
    System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
  }
}
