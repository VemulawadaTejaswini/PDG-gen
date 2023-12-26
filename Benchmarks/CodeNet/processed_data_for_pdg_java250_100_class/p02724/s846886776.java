public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int rem1 = X/500; 
    int rem2 = (X-(rem1*500))/5; 
    System.out.println(1000*rem1+5*rem2);
  }
}
