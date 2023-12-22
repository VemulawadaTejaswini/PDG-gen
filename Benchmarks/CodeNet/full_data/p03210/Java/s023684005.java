import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int a = s.nextInt();

    if(a == 7 || a == 5 || a == 3){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
