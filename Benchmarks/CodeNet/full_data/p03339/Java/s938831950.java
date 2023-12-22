import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String st = sc.next();
		boolean map[] = new boolean[st.length()];

		for(int n=0;n<st.length();n++){
			if(st.charAt(n) == 'E') map[n] = true;
			else map[n] = false;
		}
		
		int min = st.length()+1;
		for(int n=0;n<st.length();n++){
			int cnt = 0;
			for(int m=0;m<st.length();m++){
				if(n == m) continue;
				if(n < m &&  map[m]) cnt++;
				if(n > m && !map[m]) cnt++;
			}
			if(min > cnt) min = cnt;
		}
		System.out.println(min);
	}
}