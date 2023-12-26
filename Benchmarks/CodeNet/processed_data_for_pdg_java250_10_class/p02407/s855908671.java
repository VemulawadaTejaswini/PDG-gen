public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> num = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int input = sc.nextInt();
      num.add(input);
    }
    Collections.reverse(num);
    for (int i = 0; i < num.size(); i++) {
      if (i == num.size() - 1) {
        System.out.println(num.get(i));
      } else {
        System.out.print(num.get(i));
        System.out.print(" ");
      }
    }
  }
}
