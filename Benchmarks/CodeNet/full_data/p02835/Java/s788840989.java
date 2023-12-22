import java.util.Scanner;
class Main{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    if(a+b+c >= 22){
      System.out.println("bust");
    }else{
      System.out.println("win");      
    }
  }
}