import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(Math.pow(sc.nextInt(),2)-sc.nextInt());
    sc.close();
  }
}
