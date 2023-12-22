import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		String string = scanner.next();
		String mae = string.substring(0,A);
		String naka = string.substring(A,A+1);
		String ushiro = string.substring(A+2);
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(mae);
		Matcher u = p.matcher(ushiro);




		if(m.find() && u.find() && naka.equals("-")){
			System.out.println("Yes");
		}else{
			System.out.println("No");


		}



	}
}
class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

