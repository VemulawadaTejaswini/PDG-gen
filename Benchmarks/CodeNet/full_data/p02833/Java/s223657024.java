import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println(nzeros(double_factorial(n)));
  }

  public static int nzeros(int n) {
      int last = n % 10;
      int rest = n / 10;
      if (last != 0) {
        return 0;
      } else if(n == 0) {
        return 1;
      } else {
        return 1 + nzeros(rest);
      }
  }

  public static int double_factorial(int n) {
    if (n < 2) {
      return 1;
    } else {
      return n * double_factorial(n - 2);
    }
  }
}



/**
def nzeros(n):
    last = n % 10
    rest = n // 10
    if last != 0 or rest == 0:
        return 0
    else:
        return 1 + nzeros(rest)

def double_factorial(num):
    if num < 2:
        return 1
    else:
        return num * double_factorial(num - 2)

input = input()
n = int(input)
print(nzeros(double_factorial(n)))*/
