import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
    int b = scan.nextInt();
    
    
    int x = Math.max(a-b , a+b);
    int y = Math.max(x,a*b);
    System.out.println(y);
    
  }
}
