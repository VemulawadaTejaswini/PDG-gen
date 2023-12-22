import java.util.*;
import java.math.*;

public class Main {
	public static void main(String ards[])
	{
		Scanner cin = new Scanner(System.in);
		long a=cin.nextInt();
        long b=cin.nextInt();
        long c=cin.nextInt();
        if(c-a-b<0){
            System.out.println("No");
            return;
        }
        if(4*a*b<(c-a-b)*(c-a-b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}
}