import java.util.*;

public class Main {
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.next();
		
		boolean E=false, W=false, N=false, S=false;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='E') E=true;
			else if(str.charAt(i)=='W') W=true;
			else if(str.charAt(i)=='N') N=true;
			else if(str.charAt(i)=='S') S=true;
		}
		
		if(E!=W || N!=S){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}
