import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}