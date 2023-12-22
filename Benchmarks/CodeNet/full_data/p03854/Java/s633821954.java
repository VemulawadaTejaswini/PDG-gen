
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		String t = sb.append(s).reverse().toString();
		
		t = t.replaceAll("maerd", "");
		t = t.replaceAll("esare", "");
		t = t.replaceAll("remaerd", "");
		t = t.replaceAll("resare", "");
		
		if(t.equals("")){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
