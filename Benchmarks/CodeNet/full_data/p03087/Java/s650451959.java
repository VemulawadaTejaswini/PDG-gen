import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		sc.next();
		int q = Integer.parseInt(sc.next()), count = 0, l = 0, r = 0;
		String s = sc.next(), str = "";
		for(int i=0; i<q; i++){
			count = 0;
			l = Integer.parseInt(sc.next());
			r = Integer.parseInt(sc.next());
			str = s.substring(l-1, r);
			for(; str.contains("AC"); count++){
				str = str.replaceFirst("AC", "");
			}
			System.out.println(count);
		}
	}
}
