import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int one = n%10;
    n = n/10;
    int two = n%10;
    n = n/10;
    int three = n%10;
    if(one == 7 || two == 7 || three == 7){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}