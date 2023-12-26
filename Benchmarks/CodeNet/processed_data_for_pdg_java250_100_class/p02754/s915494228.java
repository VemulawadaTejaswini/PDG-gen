public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long sho = n / (a + b);
    long amari = n % (a + b);
    if(amari > a){
      System.out.println(sho * a + a);
    }else {
      System.out.println(sho * a + amari);
    }
  }
}
