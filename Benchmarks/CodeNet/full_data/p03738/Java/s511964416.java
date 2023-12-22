import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b= scan.next();

	//	long a = Long.parseLong(aS);
		//long b = Long.parseLong(bS);
		//if(a>0 &&b>0) {
			if(a.length()>b.length()) {
				System.out.println("GREATER");
			}else if(a.length()<b.length()) {
				System.out.println("LESS");
			}else if(a.length()==b.length()) {

				for (int i=0;i<a.length();i++) {
					if(a.charAt(i)>b.charAt(i)) {
						System.out.println("GREATER");
						break;
					}else if(a.charAt(i)<b.charAt(i)) {
						System.out.println("LESS");
						break;
					}else {
						continue;
					}


					}
				System.out.println("EQUAL");
				}
			}

}
