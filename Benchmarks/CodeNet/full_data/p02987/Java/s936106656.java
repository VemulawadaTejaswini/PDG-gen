import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//文字列を宣言して読み込む
		String A = sc.next();
		String ans = "No";
		if(A.charAt(0)==A.charAt(1)){
			if((A.charAt(2)==A.charAt(3))&&(A.charAt(1)!=A.charAt(2))){			
				ans="Yes";
				System.out.println(ans);
				}
			}
	if(A.charAt(0)!=A.charAt(1)){
		if((A.charAt(0)==A.charAt(3))&&(A.charAt(1)==A.charAt(2))||(A.charAt(0)==A.charAt(2))&&(A.charAt(1)==A.charAt(3))){
			ans="Yes";
			System.out.println(ans);		
		}
	}
	if(ans=="No"){
System.out.println(ans);
	}
	
	}
}