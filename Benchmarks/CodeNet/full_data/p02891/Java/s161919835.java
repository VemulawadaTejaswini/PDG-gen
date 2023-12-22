import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder st = new StringBuilder("");
		StringBuilder ss = new StringBuilder(s);
		long k = sc.nextInt();
		// int temp = k;
		// while (k-- > 0){
		// 	ss.append(st);
		// }
		long count = 0;
		// System.out.println(ss);
		char del = '$';
		for (int i = 0; i < ss.length() - 1; i++){
			if (ss.charAt(i) == ss.charAt(i + 1)){
				ss.setCharAt(i + 1, del);
				count++;
				// System.out.println(ss);
			}
		}
		//count *= k;
		if (ss.charAt(0) == ss.charAt(ss.length() - 1 ))
			count++;
		System.out.println(count * k);
	}
}