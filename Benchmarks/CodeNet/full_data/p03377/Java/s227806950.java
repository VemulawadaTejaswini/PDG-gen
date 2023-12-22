import java.util.*;
public class Main {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]) ;
		int b = Integer.parseInt(args[1]) ;
		int x = Integer.parseInt(args[2]) ;
		
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
