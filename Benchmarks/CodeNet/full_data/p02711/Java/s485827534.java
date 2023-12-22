import java.util.Scanner;
class Main{
  
  static void check_include_7(int number){
    if(number/100 == 7 || number % 10 == 7 || ((number % 100<=79)&&( number % 100 >= 70))){
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
  }
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    check_include_7(number);
    scanner.close();
  }

}
