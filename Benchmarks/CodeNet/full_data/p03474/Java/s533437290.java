import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str = sc.next();
		System.out.println(str);
		String ans = "No";
		
		for(int i=0; i<a; i++){
		    if(str.substring(i)>="0" && str.substring(i)<="9"){
		        ans = "Yes";
		    }
		}
		
		if(str.substring(a)=="-"){
		    ans = "Yes";
		}
		
		for(int i=a+1; i<b+1; i++){
		    if(str.substring(i)>="0" && str.substring(i)<="9"){
		        ans = "Yes";
		    }
		}
		
        System.out.println(ans);
	}
}
