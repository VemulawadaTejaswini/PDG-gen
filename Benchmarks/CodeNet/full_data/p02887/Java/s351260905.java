import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =  sc.nextInt();
		String s = sc.next();
		int n = 0;

		for(int i = 0;i < s.length() - 1;i++){
			if(s.charAt(i) != s.charAt(i+1)){
				n++;
			}
		}

		System.out.println(n + 1);
	}
}
