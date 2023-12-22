import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		boolean flag = false;
		for(int n=0;n<s.length();n++){
			String st = "";
			for(int m=0;m<s.length();m++){
				st += s.charAt((m+n)%s.length());
			}
			if(st.equals(t)){
				flag = true;
				break;
			}
		}
		if(flag) System.out.println("Yes");
		else System.out.println("No");
	}
}