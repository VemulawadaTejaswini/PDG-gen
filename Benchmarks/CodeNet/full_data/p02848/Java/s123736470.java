import java.util.*;

public class Main {
		public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   int N = sc.nextInt();
	   char str[] = sc.next().toCharArray();
		
		for(int i=0; i<str.length; i++) {
			 str[i] = (char) ((str[i] - 'A' + N) % 26 + 'A');
		}
      System.out.println(str);
		}
}
