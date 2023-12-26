public class Main {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    String  S   = cin.next();
    String  T   = cin.next();
    if ((T.length() - S.length()) != 1){
      System.out.println("No");
    }
    else{
      if (T.indexOf(S) == 0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
  }
}
