import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.next();
        int a = sc.next();
        int b = sc.next();
        int price;
        if(n*a < b){
            price = n*a;
        }else{
            price = b;
        }
		System.out.println(price);
	}
}