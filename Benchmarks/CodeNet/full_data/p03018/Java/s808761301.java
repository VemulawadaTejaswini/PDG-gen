import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 「ABC → BCA」の置換はAとBCの交換とみなせる
		//  なのでAかBCの連続だけを見ればいいはず

		Scanner in = new Scanner(System.in);
		String base = in.next();
		base = base.replace("BC", "X");
		base = base.replace("B", " ");
		base = base.replace("C", " "); 
		//Matcher m = Pattern.compile("A(A|X)*X").matcher(base);

		int cntA = 0;
		int answer = 0;

		//while ( m.find() ) {
		//	char[] targ = m.group().toCharArray();
		for(String s : base.split(" ")) {
			if(!s.contains("AX") ) continue;
			System.out.println(s);
			char[] targ = s.toCharArray();
			// BCの交換可能回数＝BCより左にあるAの個数
			for ( int i = 0; i < targ.length; i++ ) {
				if ( targ[i] == 'A' ) cntA++;
				else if ( targ[i] == 'X' ) answer += cntA;
			}
			cntA = 0;
		}

		System.out.println(answer);
		in.close();
	}
}