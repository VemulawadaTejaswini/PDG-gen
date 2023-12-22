import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    
    int x = a-b;
    int y = Math.abs(c-x);
    System.out.println(y);
    
  }
}
