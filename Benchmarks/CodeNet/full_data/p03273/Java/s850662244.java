import java.util.ArrayList;
import java.util.Scanner;

public class ABC107B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < h; i++) {
        	String s = sc.next();
        	arr.add(s);
        }

        for (int i = 0; i < h ;) {
        	boolean flag = false;
        	String q = arr.get(i);
        	for(int j = 0; j < w ; j++) {
        		if (q.charAt(j) != '.') {
        			flag = true;
        		}
        	}
        	if(!flag) {
        		arr.remove(i);
        		h--;
        	}else {
        		i++;
        	}
        }

        for (int j = 0; j < w;) {
        	boolean flag = false;
        	for(int i = 0; i < h ; i++) {
        		String q = arr.get(i);
        		if (q.charAt(j) != '.') {
        			flag = true;
        		}
        	}
        	if(!flag) {
        		for(int k = 0; k < h; k ++) {
        			String p = arr.get(k);
        			arr.set(k, p.substring(0, j) + p.substring(j + 1, p.length()));
        		}
        		w--;
        	}else {
        		j++;
        	}
        }
        for(String s: arr) {
        	System.out.println(s);
        }
	}
}
