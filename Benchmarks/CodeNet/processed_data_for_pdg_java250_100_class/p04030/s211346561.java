public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] s = scanner.next().split("");
    ArrayDeque<String> result = new ArrayDeque<>();
    for(String input: s) {
      if(input.equals("B")) {
        result.pollLast();
      } else {
    	result.offerLast(input);
      }
    }
    for(String r: result) {
      System.out.print(r);
    }
  }
}
