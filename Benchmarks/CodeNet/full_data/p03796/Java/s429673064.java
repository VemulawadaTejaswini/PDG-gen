
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p=1;
		int b=1;
		for(int i=1;i<=a;i++) {
			p=p*i;
		}
		for(int i=0;i<9;i++) {
			b=b*10;
		}
		System.out.println(p%(b+7));
	}
}