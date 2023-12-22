import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String b = sc.next();
    char[] c = b.toCharArray();
    if(a % 2 == 1){
      System.out.println("No");
      System.exit(0);
    }
    for(int i = 0;i < a / 2;i++){
      if(c[i] != c[(a / 2) + i]){
        System.out.println("No");
        System.exit(0);
      }
    }
    System.out.println("Yes");
  }
}