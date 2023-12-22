import java.util.Scanner;
public class Main{
	public static void main(String[] args){
      Scanner v = new Scanner(System.in);
      int x = v.nextInt();
      System.out.print(obseg(x));
    }
  public static double obseg(int x){
	return 2*3.1415*x;
  }
}
