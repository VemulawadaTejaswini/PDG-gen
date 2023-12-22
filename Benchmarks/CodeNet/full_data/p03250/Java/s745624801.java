import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inputA = Integer.parseInt(scan.next());
    int inputB = Integer.parseInt(scan.next());
    int inputC = Integer.parseInt(scan.next());
    scan.close();	
    
    int large;
    int small;
    int result;
    
    if(inputA > inputB){
      large = inputA;
      small = inputB;
    } else {
      large = inputB;
      small = inputA;
    }
    
    if(large > inputC){
      result = large * 10 + small + inputC;
    } else {
      result = inputC * 10 + small + large;
    }
    System.out.print(result);
  }
}