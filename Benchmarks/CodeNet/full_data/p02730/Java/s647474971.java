import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String country = sc.next();
		int N =country.length();
		String F_1 = country.substring(0, (N-1)/2);
		String F_2 = country.substring((N-1)/2+1,N);
		
		StringBuffer str = new StringBuffer(F_1);
		String A_1 = str.reverse().toString();
		
		StringBuffer str2 = new StringBuffer(F_2);
		String A_2 = str2.reverse().toString();
        //StringBuffer str = new StringBuffer(F_1);
        //String A_1 = str.reverse().toString();
		//String s_1 = "z",s_2 = "v";
		//int F1_len = F_1.length();
		//if(F1_len%2==1) {
		//	s_1 = F_1.substring(0,(F1_len-1)/2);
		//	s_2 = F_1.substring((F1_len-1)/2+1,F1_len);
		//}else if(F1_len%2==0) {
		//	s_1 = F_1.substring(0,F1_len/2);
		//	s_2 = F_1.substring(F1_len/2,F1_len);
		//}
        
        
		if(!F_1.equals(A_2)) {
			System.out.println("No");
		}else

       // if(s_1.equals(s_2)) {
		if(!F_1.equals(A_1)) {
        	System.out.println("No");
        }else {
        	System.out.println("Yes");
        }
       // System.out.println("F1  "+F_1+"  F2  "+F_2+"  s1  "+s_1+"  s2  "+s_2+"  A1  "+A_1+"  A2  "+A_2);
        
	}

}
