import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    String[] array = str.split("");
        int count = 0;
        for (int i=1; i<4; i++) {
        	if (array[i].equals(array[i-1])) {
            	count++;
            }
        }
        String ans = (count == 2)? "Yes": "No";
      	System.out.println(ans);
	}
}