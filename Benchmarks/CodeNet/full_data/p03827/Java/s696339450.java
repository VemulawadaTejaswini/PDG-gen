import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),
			x = 0, m = 0, i;
		String s = sc.next();
		for(i = 0; i < n; i++){
			if(s.charAt(i) == 'I')x+=1;
			if(s.charAt(i) == 'D')x-=1;
			if(m < x)m = x;
		}
		System.out.println(m);
	}
}