public class Main{
  public static void main(String args[]) {
    Scanner in  = new Scanner(System.in);
    String ring = in.nextLine();
    ring += ring;
    String str  = in.nextLine();
    if(ring.contains(str)){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
