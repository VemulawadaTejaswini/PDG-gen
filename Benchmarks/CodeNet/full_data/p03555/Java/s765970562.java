import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc =  new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int count = 0;
		int ans = 0;
		
	if(a.charAt(0) == b.charAt(2)){
		count++;
	}
	if(a.charAt(1) == b.charAt(1)){
		count++;
	}
	if(a.charAt(2) == b.charAt(0)){
		count++;
	}
	if(count == 3){
		System.out.println("YES");
	}else
		System.out.println("NO");
	
	}
}
}