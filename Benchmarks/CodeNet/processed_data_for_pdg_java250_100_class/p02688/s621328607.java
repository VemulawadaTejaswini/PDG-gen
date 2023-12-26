public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int k = K;
    Set<Integer> map = new HashSet<>();
    while (K-- > 0) {
      int i = sc.nextInt();
      while (i-- > 0) {
        int x = sc.nextInt();
        map.add(x);
      }
    }
    Set<Integer> x = IntStream.rangeClosed(1, N).boxed().collect(Collectors.toSet());
    x.removeAll(map);
    System.out.println(x.size());
  }
}
