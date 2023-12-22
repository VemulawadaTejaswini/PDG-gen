import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		long ww = sc.nextLong();
		long hh = sc.nextLong();
		long xx = sc.nextLong();
		long yy = sc.nextLong();
		
		System.out.print(ww*hh/2.0);
		System.out.print(" ");
		
		if((ww/2 == xx && hh/2==yy )|| (ww/2 == yy && hh/2==xx ) ){
			System.out.print("1");
		}else{
			System.out.print("0");
		}
		
	}
}