import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] input = scanner.nextLine().split(" ");
    int input1 = Integer.parseInt(input[0]);
    int input2 = Integer.parseInt(input[1]);
    
    int sum = 0;
    for (int i = 0; i < 2; i++) {
      if (input1 > input2) {
        sum += input1;
        input1--;
      }
      else {
        sum += input2;
        input2--;
      }
    }
    System.out.println(sum);
  }
}