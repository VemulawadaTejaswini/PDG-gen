import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt(),b = sc.nextInt();
    if(a==1||b==1)System.out.println(0);
    else System.out.println((a*b+1)/2);
  }
}