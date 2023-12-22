import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Len = S.length();
		int count = 0;

			for(int i=0; i<Len/2; i++){
				char ch1 = S.charAt(i);
				char ch2 = S.charAt(Len -1 -i);
			
				if(ch1 != ch2){
					count++;
				}
			}
			System.out.println(count);

	}
}