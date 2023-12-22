import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		char temp = 'a';

		boolean cut = true;
		while(cut){
			switch (temp) {
			case 'a':
				if(a.length() == 0){
					cut = false;
					temp = 'A';
					break;
				}else{
					temp = a.charAt(0);
					a = a.substring(1);
					break;
				}
			case 'b':
				if(b.length() == 0){
					cut = false;
					temp = 'B';
					break;
				}else{
					temp = b.charAt(0);
					b = b.substring(1);
					break;
				}
			case 'c':
				if(c.length() == 0){
					cut = false;
					temp = 'C';
					break;
				}else{
					temp = c.charAt(0);
					c = c.substring(1);
					break;
				}
			}
		}
		System.out.println(temp);
		sc.close();
	}
}
