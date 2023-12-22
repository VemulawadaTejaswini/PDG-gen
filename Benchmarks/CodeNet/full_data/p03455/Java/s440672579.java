package atcoder;
import java.util.*;
public class Main {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a%2==0){
        	if (b%2==0){
        		System.out.println("Even");
        	} else {
        		System.out.println("Odd");
        	}
        } else {
        	System.out.println("Odd");
        }
    }
}