import java.io.PrintWriter;
import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
        StringBuffer str = new StringBuffer(s);
		int q = Integer.parseInt(sc.next());

		int flip = 0;
		for(int i = 0 ; i < q ; i++) {
			int t = Integer.parseInt(sc.next());
			if(t == 1) {
				flip = flip ^ t;
			}else{
				int t2 = Integer.parseInt(sc.next());
				int index = 0;
				if(t2 == 1) {
					index = 0;
				}else {
					index = 1;
				}

				if(flip == 1) {
					if(index == 0) {
						index = 1;
					}else {
						index = 0;
					}

				}

				if(index == 0) {
					str.insert(0, sc.next());
				}else {
					str.append(sc.next());
				}


			}


		}
		PrintWriter out = new PrintWriter(System.out);

		if(flip == 1){
	         System.out.println(str.reverse().toString());
	         out.println(str.reverse().toString());
		}else {
			 out.println(str.toString());
		}
		out.flush();
	}
}