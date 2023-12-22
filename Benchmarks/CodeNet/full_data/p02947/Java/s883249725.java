import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<CharSet> list = new ArrayList<>();
        for(int i = 0; i  < n; i++) {
        	String s = sc.next();
        	list.add( new CharSet(s) );
        }

        long ans = 0;
        for(int i = 0; i < list.size(); i++) {
        	for(int j = i + 1 ; j < list.size(); j++) {
        		if(list.get(i).equals(list.get(j))) {
        			ans++;
        		}
        	}
        }
        System.out.println(ans);
	}
}

class CharSet {
	private int [] num = new int [26];

	public CharSet(String s) {
		for(int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i) - 'a';
			num[ch]++;
		}
	}

	public int[] getNum() {
		return num;
	}

	public boolean equals(CharSet other) {
		for(int i = 0; i < num.length; i++) {
			if(num[i] != other.getNum()[i]) {
				return false;
			}
		}
		return true;
	}
}