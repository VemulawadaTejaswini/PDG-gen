import java.util.Scanner;

pubilc class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    byte op = sc.nextByte();
    int B = sc.nextInt();
    int answer;
    if (op == '+')
        answer = A + B;
    else if (op == '-')
        answer = A - B;
    System.out.print("" + answer);
  }
}
