import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    short k = sc.nextShort();
    short x = sc.nextShort();
    if(500 * k >= x){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
