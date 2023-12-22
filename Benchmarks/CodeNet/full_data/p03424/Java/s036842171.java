import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s;
		String a = "Three";
		for(int i = 1; i <= n; i++) {
			try {
                s = sc.next();
                if(s == "Y") a = "Four";
			}
			catch(Exception e){
	            e.printStackTrace();
	        }
			}
        System.out.println(a);
		}	
}
