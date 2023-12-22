import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long a = 1;
		long b = n;
		ArrayList<Integer> list = new ArrayList<>();
		int min = String.valueOf(n).length();
		if(Math.sqrt(n) - (int)(Math.sqrt(n)) == 0) {
		    min = String.valueOf((int)Math.sqrt(n)).length();
		}else {
    		for(int i=2; i<=Math.sqrt(n); i++) {
    		    if(b % i == 0) {
    		        list.add(i);
    		        a *= i;
    		        b /= i;
    		        i--;
    		    }
    		}

    		
    		for(int i=0; i<Math.pow(2, list.size()); i++) {
    		    a = 1;
    		    b = n;
    		    for(int j=0; j<list.size(); j++) {
    		        if((1&i>>j) == 1) {a*=list.get(j); b /= list.get(j);}
    		    }
    		    if(min > Math.max(String.valueOf(a).length(), String.valueOf(b).length())) min = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
    		}
		}
		
		System.out.println(min);
	}
}