import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char s1 = sc.nextInt();
      	char s2 = sc.nextInt();
        char s3 = sc.nextInt();
      	String s = sc.next();
		String s = s1 + s2 + s3;
		char c = '1';
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
    	if (s.charAt(i) == c) {
        count++;
    }
}
      	System.out.println(count);
    }
}