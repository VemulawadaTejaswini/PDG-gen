import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%10==7 || (a/10)%10 == 7 || (a/100)==7 ){System.out.println("Yes");}
		else{System.out.println("No");}
	}
}
