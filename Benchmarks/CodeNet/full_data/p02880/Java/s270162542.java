import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int bynary = 0;
    for (int i=2;i<10;i++) {
      if(N%i==0 && N/i<10){
        System.out.println("Yes");
        bynary = 1;
        break;
      }
    }
    if(bynary == 0){
      System.out.println("No");
    }
  }
}