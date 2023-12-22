public class Main {
	public static boolean isPalindrome(int x){
		int temp=0;      
		while(x>temp){           
			temp=temp*10+x%10;           
			x/=10;  
					}       
		return  (temp==x)||(temp/10==x);   
		}
}
