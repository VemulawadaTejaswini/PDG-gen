import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String args[]) throws Exception {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String s = "";
while (buffer.ready()) {
    s = buffer.readLine();
}
for(int i = 0; i < s.length(); i++) {
    	if(i != 0) {
    	    if(s.charAt(i-1) != s.charAt(i));
        	System.out.println("YES");
	break;
}
System.out.println("NO");
    }
}
}