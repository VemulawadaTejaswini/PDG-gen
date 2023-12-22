import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int x=s.nextInt(),a=s.nextInt();
    System.out.println(x<a?0:10);
  }
}