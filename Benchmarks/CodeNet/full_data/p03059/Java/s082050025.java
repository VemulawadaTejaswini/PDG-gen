import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
      	int b = sc.nextInt();
      	double t = sc.nextDouble();
      	int sec = (int)((t+0.5)/a);
      	int sum = b*sec;
      	System.out.println(sum);
    }
}