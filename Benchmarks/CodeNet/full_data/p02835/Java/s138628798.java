import java.util.Scanner;
public class Main {
  public static void main(String args[]){
    Scanner a1 = new Scanner(System.in);
    int A1 = a1.nextInt();
    Scanner a2 = new Scanner(System.in);
    int A2 = a2.nextInt();
    Scanner a3 = new Scanner(System.in);
    int A3 = a3.nextInt();

    if (A1+A2+A3 >=22){
      System.out.println("bust");
    }else {
      System.out.println("win");
    }
  }
}
