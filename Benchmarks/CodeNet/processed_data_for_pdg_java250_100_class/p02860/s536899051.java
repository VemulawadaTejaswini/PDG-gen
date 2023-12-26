public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int len = sc.nextInt();
    String str = sc.next();
    if (len%2 == 1){System.out.println("No");return;}
    String substr_later = str.substring((len/2), len);
    if (str.startsWith(substr_later)){
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
  }
}
