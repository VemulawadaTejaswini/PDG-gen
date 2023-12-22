import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		String st = String.valueOf(N);

		int rem = 0;
		for(int n=0;n<st.length();n++){
			rem += Character.getNumericValue(st.charAt(n));
		}

		if(N%rem == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}