import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    x-=a;
    x-=b*(x/b);
    System.out.println(x);
  }
}