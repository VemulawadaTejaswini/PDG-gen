import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		double W = sc.nextDouble();
      double H = sc.nextDouble();
      int x = sc.nextInt();
      int y = sc.nextInt();
      String isCenter = "0";
      if(x == W / 2 && y == H / 2){
        isCenter = "1";
      }
      System.out.println((W * H / 2) + " " + isCenter);
	}
}
