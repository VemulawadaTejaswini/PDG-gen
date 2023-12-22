import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    a-=500*(a/500);
    if (a<=b) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}