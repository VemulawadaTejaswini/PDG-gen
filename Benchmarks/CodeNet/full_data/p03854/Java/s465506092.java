import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();

	    while(s.length() >= 0){
	    	if (s.substring(s.length() - 5).equals("erase") || s.substring(s.length() - 5).equals("dream")){
	    		s = s.substring(0, s.length() - 5);
	    	}else if (s.substring(s.length() - 6).equals("eraser")){
	    		s = s.substring(0, s.length() - 6);
	    	}else if (s.substring(s.length() - 7).equals("dreamer")){
	    		s = s.substring(0, s.length() - 7);
	    	} else if (s.length() <= 0){
	    		System.out.println("YES");
	    		break;
	    	} else{
	    		System.out.println("NO");
	    		break;
	    	}
	    }
	}
}