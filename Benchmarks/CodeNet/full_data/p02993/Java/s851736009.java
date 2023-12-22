import java.io.PrintWriter;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		String s = sc.next();
		char[] c = s.toCharArray();

		if(c[0]==c[1] || c[1]==c[2] || c[2]==c[3]){
			out.println("Bad");
		}else{
			out.println("Good");
		}

		out.flush();
	}
}
