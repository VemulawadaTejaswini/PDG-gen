import java.util.*;
public class Main {
	public static void main(String[] args){
		int a = new Integer(args[0]) ;
		int b = new Integer(args[1]) ;
		int x = new Integer(args[2]) ;
		
		if(x<a){
			System.out.println("NO");
		}else{
			if(x>(a+b)){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}
}
