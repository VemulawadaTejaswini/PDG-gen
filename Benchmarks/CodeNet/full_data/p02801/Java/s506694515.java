import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    char d = (char)((int)c+1);
    System.out.println(d);
  }
}