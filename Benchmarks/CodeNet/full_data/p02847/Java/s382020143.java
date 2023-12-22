import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// TODO Auto-generated method stub
		String []w = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		String s = stdIn.next();
		
		for(int i = 0; i < w.length; i++){
			if(s.equals(w[i])){
				System.out.println(7-i);
				System.exit(0);
			}
		}
		
		
		
	}

}
