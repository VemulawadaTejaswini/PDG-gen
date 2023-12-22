import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =  sc.nextInt();
		String s = sc.next();
		String str = "";

		for(int i = 0;i < s.length() - 1;i++){
			if(s.charAt(i) != s.charAt(i+1)){
				str += String.valueOf(s.charAt(i));
			}
		}

		System.out.println(str.length() + 1);
	}
}





