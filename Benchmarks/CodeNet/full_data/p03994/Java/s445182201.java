import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();

		int i = 0;
		while(i<s.length()){
			int j = 26 - (s.charAt(i) - 'a');
			if(i==s.length()-1){
				int t = ((s.charAt(i)-'a') + k)%26;
				System.out.println((char)(t+'a'));
			}else if(k>=j && j!=26){
				System.out.print('a');
				k -= j;
			}else{
				System.out.print(s.charAt(i));
			}
			i++;
		}
	}
}