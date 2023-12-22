import java.util.*;

public class Main {
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		int ans=1;
		for(int i=a; i<=b; i++) ans*=i;
		if(ans>0) System.out.println("Positive");
		else if(ans<0) System.out.println("Negative");
		else System.out.println("Zero");
	}
}
