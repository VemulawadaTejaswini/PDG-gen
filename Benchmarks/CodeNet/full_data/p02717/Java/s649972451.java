import java.util.Scanner;
public class Main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int x = scan.nextInt();
  int y = scan.nextInt();
  int z = scan.nextInt();
  int temp= x;
  x = y;
  y = temp;
  temp = x;
  x = z;
  z = temp;
  System.out.println(x + " " + y + " " + z);
 }
}
