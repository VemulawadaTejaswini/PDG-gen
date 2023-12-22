import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
		long a = sc.nextLong();
		long b = sc.nextLong();
		String ans ="";
		
		if(a>b){
		    ans = "GREATER";
		}else if(a<b){
		    ans = "LESS";
		}else{
		    ans = "EQUAL";
		}

		
		System.out.println(ans);
    }
}
