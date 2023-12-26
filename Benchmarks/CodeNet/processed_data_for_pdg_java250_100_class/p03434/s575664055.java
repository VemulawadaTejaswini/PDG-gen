public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer[] arr = new Integer[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr, Comparator.reverseOrder());
    int alice = 0;
    int bob = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        alice += arr[i];
      } else {
        bob += arr[i];
      }
    }
    System.out.println(alice - bob);
  }
}
