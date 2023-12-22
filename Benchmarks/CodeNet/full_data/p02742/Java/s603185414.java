import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double H = sc.nextDouble();
    double W = sc.nextDouble();
    if (H != 1 && W != 1)
			System.out.println((long) Math.ceil(H * W / 2));
		else
			System.out.println(1);
  }
}
    