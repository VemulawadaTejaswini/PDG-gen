public class Main { 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Integer K = Integer.parseInt(sc.next());
      String S = sc.next();
      String answer = K >= S.length() ? S : S.substring(0,K) + "...";
      System.out.println(answer);
    }
}
