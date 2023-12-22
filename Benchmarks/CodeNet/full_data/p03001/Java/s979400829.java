import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double W = sc.nextInt(); //X
		double H = sc.nextInt(); //Y
    double x = sc.nextInt();
    double y = sc.nextInt();

    double rectangle = W*H/2.0;
    System.out.printf("%f ", rectangle);
    if(W/2.0 == x && H/2.0 == y)
      System.out.println("1");
    else
      System.out.println("0");
	}
}