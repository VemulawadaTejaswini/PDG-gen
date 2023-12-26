public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String n = a+b;
    int k = Integer.parseInt(n);
    int kk = (int)(Math.sqrt(k));
    System.out.println(Math.pow(kk, 2) == k ? "Yes" : "No");
  }
}
