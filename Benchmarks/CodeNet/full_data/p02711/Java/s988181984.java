import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a/100 == 7 || (a%100)/10 == 7 || (a%10) == 7) System.out.println("Yes");
    else System.out.println("No");
  }
}