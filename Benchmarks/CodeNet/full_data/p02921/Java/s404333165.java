import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int T = 0;
		for(int i=1;i<3;i++){
			if (a.charAt(i)==b.charAt(i)){
					T++;
			}
		}
		System.out.println(T);
	}
}
