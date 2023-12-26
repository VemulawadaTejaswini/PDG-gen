public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    int year = 0;
    BigDecimal money = new BigDecimal(100);
    BigDecimal X = new BigDecimal(x);
    while (X.compareTo(money) > 0) {
      money = money.multiply(new BigDecimal("1.01")).setScale(0, RoundingMode.DOWN);
      year++;
    }
    System.out.println(year);
  }
}
