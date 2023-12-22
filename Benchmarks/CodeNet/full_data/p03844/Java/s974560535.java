import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String op  = sc.next();
        String B = sc.next();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        
        if(op.equals("+")){
            System.out.println(a+b);
        }else{
            System.out.println(a-b);
        }
	}
}