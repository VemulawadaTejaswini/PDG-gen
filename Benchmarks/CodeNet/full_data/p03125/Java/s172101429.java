public class Main{
  public static void main(String[] args){
    Scanner key = new Scanner(System.in);
    int A = key.nextInt();
    int B = key.nextInt();
    System.out.println((B%A==0) ? (A+B) : (B-A));
  }
}