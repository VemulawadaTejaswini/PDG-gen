import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int a = 0;
    for(int i = 0;i < N;i++) {
      a += sc.nextInt();
    }
    if(H <= a) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}