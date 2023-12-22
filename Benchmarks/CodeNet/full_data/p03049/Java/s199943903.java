import java.util.Scanner;
 
public class Main{
		
	public static void main(String args[]){
		  
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    String s;
	    int cnt = 0;
	    int cnt_a = 0;
	    int cnt_b = 0;
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < N; i++) {
	    	s = sc.next();
	    	if(s.contains("AB")) {
	    		cnt++;
	    		sb.append(s);
	    	}
	    	if(s.charAt(s.length()-1) == 'A'){
	    		cnt_a++;
	    	}else if(s.charAt(0) == 'B'){
	    		cnt_b++;
	    	}
	    }
	    
	    System.out.println(cnt+Math.min(cnt_a, cnt_b));
	    
	}
}
