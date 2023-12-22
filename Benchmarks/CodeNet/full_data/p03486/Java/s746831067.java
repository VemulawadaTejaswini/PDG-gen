import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		String s_p, t_p;

		int s_l = s.length();
		int t_l = t.length();
		int l = 0;
		int count = 0;

		if (s_l - t_l > 0){
			l = t_l;
		}else{
			l = s_l;
		}

		for (int i = 0; i < l; i ++){
			s_p = s.substring(i, i+1);
			t_p = t.substring(i, i+1);
			if(s_p.compareTo(t_p) != 0){
				System.out.println("Yes");
				break;
			}

			count += 1;
		}

		if(count == l){
			if(s_l == t_l){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}	
		}

	}
}