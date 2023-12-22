import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] spl = s.split(" ");
	double a = Double.parseDouble(spl[0]);
	double b = Double.parseDouble(spl[1]);
	double x = (a + b) / 2;
    System.out.println((int)Math.ceil(x));
    sc.close();
  }
}