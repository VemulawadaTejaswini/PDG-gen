import java.util.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   String  S = sc.next();
   int N = S.length();
   String  S2 = S.substring(0,(N-1)/2);
   String  S3 = S.substring(((N+3)/2)-1,N); 
   if (isPalindrome(S)&&isPalindrome(S2)&&isPalindrome(S3)){
     System.out.printf("Yes");
   }else{
     System.out.printf("No");
   } 
}
  static boolean isPalindrome (String s) {
	int n = s.length();
	for (int i=0; i<n/2; i++) {
		if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
	}
	return true;
}
}
