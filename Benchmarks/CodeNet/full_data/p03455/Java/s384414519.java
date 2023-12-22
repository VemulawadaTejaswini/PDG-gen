import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    float calc_result = (float)a*b/2;
    String string_calc_result = String.valueOf(calc_result);
  
    if(string_calc_result.indexOf(".5") == -1){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}