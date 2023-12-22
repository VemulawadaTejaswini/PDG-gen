import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int a1 = a/1000;
		int a2 = a/100 - a1 * 10;
		int a3 = a/10 -a2 * 10 -a1*100;
	    int a4 = a - a3 * 10 -a2*100 -a1*1000;
	    if(a1 == a2 || a2 == a3 || a3 == a4 ){
	        System.out.println("Bad");
	    }else{
	        System.out.println("Good");
	    }
	}
}