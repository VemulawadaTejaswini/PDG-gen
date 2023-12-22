public class Main {
  public static void main(String[]$) {
    int p=new java.util.Scanner(System.in).nextInt();
    System.out.println(p==1?0:1L<<p-(p==0?0:1));
  }
}