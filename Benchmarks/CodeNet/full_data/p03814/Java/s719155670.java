import java.util.Scanner;

public class Main{
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String S = sc.next();
		String K = S;
		String D = S;
		int i = 0;
		int j=0;
		int sum;
		for(int k =0;k<S.length();k++){
		char D1 = D.charAt(k);
		if(D1=='A')	{
		
		for(i=0;i<S.length();i++){
			char s = S.charAt(i);
			if(s =='A')break;
			
		}
		for(j=i;j<S.length();j++){
			char s1 = K.charAt(j);
			if(s1 =='Z')break;
			
			
				
		}
		}
	

		}
		sum=j-i+1;
		System.out.println(sum);
	}
}

