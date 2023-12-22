import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
	for(int i = 0; i < a.length(); i++){
	    if(a.equals(b)){
		System.out.println("Yes");
		return;
	    }
	    a = a + a.charAt(0);
	    a = a.substring(1);
	}
	System.out.println("No");
    }
}
