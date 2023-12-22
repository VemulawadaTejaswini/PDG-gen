import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int ab=b-a;
    int bc=c-b;
    if (ab==bc){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}