public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int a = Integer.parseInt(str);
    str = scan.next();
    int b = Integer.parseInt(str);
    System.out.println(a*b + " " + 2*(a+b));
  }
}
