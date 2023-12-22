import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstNum = scanner.nextInt();
    int secondNum = scanner.nextInt();
    int sumOne = 0;
    for(int i=0; i<firstNum; i++){
      sum = sum * 10 + firstNum;
    }
    int sumTwo = 0;
    for(int i=0; i<secondNum; i++){
      sumTwo = sumTwo * 10 + firstNum;
    }
    if(sumOne > sumTwo) return System.out.println(sumOne);
    else System.out.println(sumTwo);
  }
}