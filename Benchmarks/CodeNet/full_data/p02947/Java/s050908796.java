import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		for(int i = 0; i < n; i++){
			str[i] = sc.nextLine();
		}
		int count = 0;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
					if(is_anagram(str[i],str[j])){
						count++;
					}
				}
			}
		System.out.println(count);
		
	}
	
	public static boolean is_anagram(String str1, String str2){
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		int[] a = new int[26];
		Arrays.fill(a,0);
		int[] b = new int[26];
		Arrays.fill(b,0);
		
		for(int i = 0; i < 10; i++){
			a[ch1[i] - 97] += 1;
			b[ch2[i] - 97] += 1;
		}
		for(int i = 0; i < 26; i++){
			if(a[i] != b[i]){
				return false;
			}
		}
	  return true;
		
	}
	} 