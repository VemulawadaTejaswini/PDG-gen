import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i=1;
		for(;;) {
			if(a<b*i+c*(i+1))break;
			i++;
		}
		System.out.println(i-1);
	}
}