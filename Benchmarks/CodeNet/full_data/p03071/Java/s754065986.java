import java.util.Scanner;

class Main{
  static int answer(int a, int b) {
    int answer = 0;
    for(int i = 0; i < 2; i++) {
      if(a>=b) {
        answer += a;
        a--;
      }else {
        answer += b;
        b--;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    System.out.println(answer(a, b));
  }
}