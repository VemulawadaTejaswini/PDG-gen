import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	char[] str = s.next().toCharArray();
    	for (int i =0; i < str.length; i++){
			int ans = (((n + str[i]) - 'A') % 26) + 'A';
			str[i] = (char) ans;
		}
    	System.out.println(new String(str));


    }
}

