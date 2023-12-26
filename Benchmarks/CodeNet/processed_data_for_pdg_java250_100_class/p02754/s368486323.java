public class Main {
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);      
      Long sum      = Long.parseLong(scan.next());
      Long blue     = Long.parseLong(scan.next());
      Long red      = Long.parseLong(scan.next());
      Long result   = sum/(blue+red)*blue;
      result += Math.min(sum%(blue+red), blue);
      System.out.println(result);
    } catch (Exception e) {     
      System.out.print("error");
    }
  }
}
