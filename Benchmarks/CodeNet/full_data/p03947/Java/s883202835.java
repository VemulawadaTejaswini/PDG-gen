import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char s[] = sc.next().toCharArray();
		
		int cnt = 0;
		for(int i=1;i<s.length;i++){
			if(s[i] != s[i-1])
				cnt++;
		}
		System.out.println(cnt);
	}

}
