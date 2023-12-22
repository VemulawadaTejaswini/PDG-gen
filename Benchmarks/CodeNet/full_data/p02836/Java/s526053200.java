public class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String in = scan.next();
    int count = 0;
    char[] input = in.chars();
    ArrayList<char> list = new ArrayList<>();
    for (int i = 0;i < input.length() / 2;i++) {
      if (input.get(i) != input.get(input.length() -1 - i) {
        count++;
      }
    }
  }
}