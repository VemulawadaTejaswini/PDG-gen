import java.util.Scanner;
public class Main {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Integer n = in.nextInt();
		
		for(int i=0;i<n;i++){
			Integer a = in.nextInt();
			if(a!=1){
				Integer b = in.nextInt();
				if(b!=1)
					s = s + in.next();
				else
					s = in.next() + s;
			}
			else{
				String q = "";
				for(int j = 0;j < s.length();j++){
					q = s.charAt(j) + q;
				}
				s = q;
			}
		}
		System.out.println(s);
	}
}
