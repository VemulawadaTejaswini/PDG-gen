import java.util.Scanner;
class Main{
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int t = a;
    int x = c;
    a = b;
    b = t;
    c = a;
    a = x;
    System.out.println(a + "" + b + "" + c);
    }
}