public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean repetNum = false;
    for (int i = 0; i < S.length() - 1; i++) {
      if(S.charAt(i) == S.charAt(i + 1)) repetNum = true;
    }
    System.out.println(repetNum ? "Bad" : "Good");
  }
}
