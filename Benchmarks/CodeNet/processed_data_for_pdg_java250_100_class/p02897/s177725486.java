public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(Math.ceil(n / 2.0) / n * 1.0);
   }
}
