public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int i = sc.next().replaceAll("0","").length();
      System.out.println(i);
    }
}
