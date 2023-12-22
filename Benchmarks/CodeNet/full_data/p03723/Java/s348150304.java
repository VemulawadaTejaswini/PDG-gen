import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int a, b, c;
    int aa, bb, cc;
    int ans = 0;
    int tmp_a, tmp_b;

    a = cin.nextInt();
    b = cin.nextInt();
    c = cin.nextInt();

    aa = a;
    bb = b;
    cc = c;

    while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
      tmp_a = a;
      a = b / 2 + c / 2;
      tmp_b = b;
      b = tmp_a / 2 + c / 2;
      c = tmp_a / 2 + tmp_b / 2;
      ans ++;
      //System.out.println(a + " " + b + " " + c);
      if (a == aa & b == bb & c == cc){
        ans = -1;
        break;
      }
    }
    System.out.println(ans);
  }
}
