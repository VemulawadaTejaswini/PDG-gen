import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
	switch (a){
      case 25:
        System.out.println("Christmas");
        break;
      case 24:
        System.out.println("Christmas Eve");
        break;
      case 23:
        System.out.println("Chiristmas Eve Eve");
        break;
      case 22:
        System.out.println("Chiristmas Eve Eve Eve");
        break;
      default:
        break;
    }
  }
}