import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int r,g,b;
    Scanner sc=new Scanner(System.in);
    int r = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((100*r+10*g+b)%4==0){
      System.out.println("Yes");}
    else{System.out.println("No");}
  }
}
