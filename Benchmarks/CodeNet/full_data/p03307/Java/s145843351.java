public class Main{
  public static void main(String [] args){
    Scanner sc = new java.util.Scanner(System.in);
    int N = sc.nextInt();
    int m = N;
    if (m%2 !=0){
      m *=2;
    }
    System.out.println(m);
  }
}