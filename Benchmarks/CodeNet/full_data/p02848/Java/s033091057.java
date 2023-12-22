import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	String s = sc.next();
      	char[] c = s.toCharArray();
      	for(char c1 : c) {
      	    char c2 = c1;
      	    c2 += n;
      	    if (c2 > (char)'Z') {
      	        c2 -= 'Z';
      	        c2 --;
      	        c2 += 'A';
      	    }
      	    System.out.print(c2);
      	}
      	System.out.println("");
    }
}