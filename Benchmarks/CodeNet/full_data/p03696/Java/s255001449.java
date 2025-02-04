import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int  num = Integer.parseInt(br.readLine());
	String s = br.readLine();
	int left = 0;
	for (int i = 0; i < num; i++) {
	    if(s.charAt(i) == '(') left++;
	    else left--;
	    if (left < 0) {
		s = "(" + s;
		num++;
		i++;
		left++;
	    }
	}
	for (int i = left ; i > 0; i--) {
	    s = s + ")";
	}
	System.out.println(s);
    }
}
