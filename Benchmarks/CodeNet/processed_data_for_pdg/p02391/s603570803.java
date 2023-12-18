public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_a, number_b;
    number_a = Integer.parseInt(sc.next());
    number_b = Integer.parseInt(sc.next());
    if(number_a > number_b) System.out.println("a > b");
    else if(number_a < number_b) System.out.println("a < b");
    else System.out.println("a == b");
  }
}
