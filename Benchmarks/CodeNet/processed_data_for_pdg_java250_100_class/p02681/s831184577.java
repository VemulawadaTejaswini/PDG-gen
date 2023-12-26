public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String t = scanner.next();
    int tLength = t.length();
    String T = t.substring( 0 , tLength - 1);
    if( s.equals(T)) {
        System.out.println("Yes");
    }else {
        System.out.println("No");
    }
    scanner.close();
  }
}
