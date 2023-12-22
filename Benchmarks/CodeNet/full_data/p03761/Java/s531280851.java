import java.util.*;

public class Main{
	public static void main(String[] args) {
		char c;
		int count, _count, ind;
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] t = new String[n];
		
		for(int i = 0; i < n; i++) t[i] = s.next();
		
		c = 'a';
		while(c <= 'z') {
			count = 0;
			for(int i = 0; i < n; i++) {
				_count = 0;
				ind = t[i].indexOf(c);
				while(ind != -1) {
					_count++;
					ind = t[i].indexOf(c, ind + 1);
				}
				if(_count == 0) {
					count = 0;
					break;
				}else if(count > _count || i == 0) {
					count = _count;
				}
			}
			
			for(int i = 0; i < count; i++) System.out.print(c);
			c++;
		}
		
		System.out.println("");
	}
}
