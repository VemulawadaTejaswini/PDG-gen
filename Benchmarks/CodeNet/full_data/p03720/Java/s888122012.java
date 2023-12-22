import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] c=new int[a];
		for(int i=0;i<b*2;i++) {
			int d = sc.nextInt();
			++c[d-1];
		}
		for(int i=0;i<a;i++){
			System.out.println(c[i]);
		}
	}
}