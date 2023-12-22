import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int s_count = sc.nextInt();
		int t_count = sc.nextInt();
	    String u = sc.next();
	    if(s.equals(u)) {
	    	s_count = s_count -1;
	    }else if(t.equals(u)) {
	    	t_count = t_count -1;
	    }
	    
	    System.out.println(s_count+" "+t_count);

	}

}