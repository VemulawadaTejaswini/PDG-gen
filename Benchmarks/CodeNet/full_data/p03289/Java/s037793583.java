import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		boolean flag = true;
		if(st.charAt(0) == 'A'){
			int cnt = 0;
			for(int n=2;n<st.length()-1;n++){
				if(st.charAt(n) == 'C') cnt++;
				else if(!(0<=(st.charAt(n)-'a') &&(st.charAt(n)-'a')<=25)) flag = false;
			}
			if(cnt!=1) flag = false;

		}else{
			flag = false;
		}

		if(flag) System.out.println("AC");
		else System.out.println("WA");

	}
}