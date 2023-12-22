import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		
		char[] chars = s.toCharArray();
		
		int curK = K;
		for(int i=0; i<s.length(); ++i) {
			int dif = 'z'-chars[i];
			if(dif<curK) {
				chars[i] = 'a';
				curK -= dif + 1;
			}
			if((i==(s.length()-1)) && (curK>0)) {
				if(dif<curK) {
					chars[i] = 'a';
					curK -= dif + 1;
				}
				curK %= 26;
				chars[i] += curK;
			}
		}
		
		s = String.valueOf(chars);
	
		System.out.println(s);
		sc.close();
	}
}