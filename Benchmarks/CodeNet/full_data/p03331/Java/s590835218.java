import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int min = -1;
		for(int n=1;n<N/2+1;n++){
			int t = N-n;

			String st1 = String.valueOf(n);
			String st2 = String.valueOf(t);
			int val = 0;
			for(int m=0;m<st1.length();m++){
				val += st1.charAt(m)-'0';
			}
			for(int m=0;m<st2.length();m++){
				val += st2.charAt(m)-'0';
			}
			if(min==-1) min = val;
			if(min>val) min = val;
		}

		System.out.println(min);
		

	}
}