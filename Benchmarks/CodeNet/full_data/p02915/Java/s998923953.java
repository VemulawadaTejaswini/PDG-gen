import java.util.Scanner;

class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
	double b = 3.0;

    System.out.println((int)Math.pow(a,b));

    sc.close();
  }
}