
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();;
		int c;
		if(a<=b&&a+w>=b) {
			c=0;
		}else if(a<=b+w&&a+w>=b+w) {
			c=0;
		}
		else if(a+w<b+w) c=b-(a+w);
		else c=b-a+w;
		if(c<0)c=-c;
		System.out.println(c);
	}
}