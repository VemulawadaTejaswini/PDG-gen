
import java.util.*;


public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		boolean tag=false;
		for(int i=1;i<str.length()-1;i++){
			if(c[i-1]!=c[i+1]){
				tag=true;
				break;
			}
		}
		if(tag==false){
			System.out.println("Second");
		}
		else{
			if(str.length()%2==0) 	System.out.println("First");
			System.out.println("Second");
		}

	}
}
