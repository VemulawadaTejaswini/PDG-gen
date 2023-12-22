import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		if((is_Palindrome(s, n))){
			int n1 = (n - 1)/ 2;
			int n2 = (n + 3)/ 2 - 1;
			String s1 = s.substring(0,n1);
			String s2 = s.substring(n2, n);
			//System.out.println(s1);
			//System.out.println(s2);
			if(is_Palindrome(s1, n1)){
				if(is_Palindrome(s2, n1)){
					System.out.println("Yes");
				}
				else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
			}
		}
		else{
			System.out.println("No");
		}
		
	}
	
	public static boolean is_Palindrome(String s, int n){
		boolean flag = true;
		if(n % 2 != 0){
			int n3 = (n - 1)/ 2;
			int i = 0;
			while(i < n3){
				if(s.charAt(i) != s.charAt(n - i - 1)){
					flag = false;
					break;
				}
				i++;
			}
		}
		else{
			int n3 = (n - 1)/ 2 + 1;
			int i = 0;
			while(i < n3){
				if(s.charAt(i) != s.charAt(n - i - 1)){
					flag = false;
					break;
				}
				i++;
			}
		}
		return flag;
	}
	
	}