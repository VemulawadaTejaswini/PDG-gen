public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    List<Integer> list = Arrays.asList(a, b, c);
    list.sort(Comparator.naturalOrder());
    System.out.println(list.stream().map(String::valueOf).reduce((x, y) -> x + " " + y).get());
    sc.close();
  }
}
