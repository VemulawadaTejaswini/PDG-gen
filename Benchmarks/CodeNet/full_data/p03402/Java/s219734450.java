import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		StringBuilder sb = new StringBuilder();
		String ls = System.lineSeparator();
		int h = 0;
		int w = 2;
		int numA = 0;
		int numB = 0;
		if(a<b) {
			while(numA<a) {
				sb.append("##");
				sb.append(ls);
				sb.append("..");
				sb.append(ls);
				numA++;
				numB++;
				h += 2;
			}
			while(numB<b) {
				sb.append("#.");
				sb.append(ls);
				sb.append("..");
				sb.append(ls);
				numB++;
				h += 2;
			}
		}else {
			while(numB<b) {
				sb.append("..");
				sb.append(ls);
				sb.append("##");
				sb.append(ls);
				numA++;
				numB++;
				h += 2;
			}
			while(numA<a) {
				sb.append(".#");
				sb.append(ls);
				sb.append("##");
				sb.append(ls);
				numB++;
				h += 2;
			}
		}
		
		System.out.println(h+" "+w);
		System.out.println(sb.toString());
		in.close();
	}

}
