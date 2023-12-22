import java.util.*;
public class Main {
	public static void main(String[] args){
		// get numbers
		Scanner sc = new Scanner(System.in);        
		String a = sc.next();
        String b[] = new String[a.length()];
        int cal = 0;
        int ans = 0;

        for (int i = 0; i < a.length(); i++) {
            b[i] = a.substring(i, i+1);
        }

        for (String val : b) {
            if (val.equals("A") || 
                val.equals("C") || 
                val.equals("G") || 
                val.equals("T")) {
                cal++;
                if (cal > ans) {
                    ans = cal;
                }
            } else {
                cal = 0;
            }
        }
		// output
        System.out.println(ans);
        sc.close();
	}
}