import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		while(s.length() > 0){
			if(s.length() >= 6 && (s.substring(0, 6).equals("dreamr")
					|| s.substring(0, 6).equals("eraser"))){
				s = s.substring(6);
			}
			else if(s.length() >= 5 && (s.substring(0, 5).equals("dream")
					|| s.substring(0, 5).equals("erase"))){
				s = s.substring(5);
			}
			else{
				break;
			}
		}
		
		if(s.length() > 0){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
		
		sc.close();
	}

}