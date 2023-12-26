public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<String> judge = new HashSet<>(Arrays.asList(sc.next().split("")));
    if (judge.size() == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
