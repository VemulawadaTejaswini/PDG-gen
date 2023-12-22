import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mod = (n + 7) / 7;
    boolean f = false;
    for(int j = 0; j < mod; j++){
      if((n % ( 7 * j )) % 4 == 0){
        f = true;
      }
    }
    if(f == false)
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}
