public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    double N = sc.nextDouble();
    double oddNum = (double)( ((int)N + 1) / 2 );
    double result = oddNum / N;
    System.out.println(result);
  }
}
