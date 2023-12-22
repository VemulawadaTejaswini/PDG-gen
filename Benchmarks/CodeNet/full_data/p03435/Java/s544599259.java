import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int total = 0;
    for (int i = 0 ; i < 9 ; i++){
      int temp = sc.nextInt();
      total += temp;
    }
    if (total % 3 == 0) System.out.println("Yes");
    else System.out.println("No");
    sc.close();
  }
}
