import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    byte a = sc.nextInt();
    byte b = sc.nextInt();
    if(a != 2 && b != 2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}