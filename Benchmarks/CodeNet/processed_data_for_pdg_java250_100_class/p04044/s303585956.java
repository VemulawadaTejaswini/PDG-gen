public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int l = scanner.nextInt();
    ArrayList<String> word = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      word.add(scanner.next());
    }
    word.sort(Comparator.naturalOrder());
    for(String w: word) {
      System.out.print(w);
    }
  }
}
