import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String astr = sc.next();
		String bstr = sc.next();
		String cstr = sc.next();

		int count = 0;

		for(int i=0; i<n; i++) {
			if(astr.substring(i, i+1).equals(bstr.substring(i, i+1)) &&
					astr.substring(i, i+1).equals(cstr.substring(i, i+1))) {
				continue;
			} else if(astr.substring(i, i+1).equals(bstr.substring(i, i+1)) &&
					!(astr.substring(i, i+1).equals(cstr.substring(i, i+1)))) {
				count = count + 1;
			} else if(!(astr.substring(i, i+1).equals(bstr.substring(i, i+1))) &&
					astr.substring(i, i+1).equals(cstr.substring(i, i+1))) {
				count = count + 1;
			} else if(!(astr.substring(i, i+1).equals(bstr.substring(i, i+1))) &&
					!(astr.substring(i, i+1).equals(cstr.substring(i, i+1))) &&
					bstr.substring(i, i+1).equals(cstr.substring(i, i+1))) {
				count = count + 1;
			} else {
				count = count + 2;
			}
		}

		System.out.println(count);
		sc.close();
	}

}
