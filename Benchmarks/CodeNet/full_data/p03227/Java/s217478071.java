import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = s;
        
        if(ans.length()==3){
            ans = ""+s.charAt(2) + s.charAt(1) + s.charAt(0);
        }
		
		System.out.println(ans);
	}
}
