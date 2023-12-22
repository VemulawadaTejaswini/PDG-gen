import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char ch[] = S.toCharArray();
        int N = S.length();
        int count = 0;
        for(int i = 0; i <= N/2-1; i++) {
        	if(ch[i] != ch[N-1-i]) {
        		count++;
        	}
        }
        System.out.println(count);
    
    }
}