import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		if(A.length() > B.length()) {
			System.out.println("GREATER");
		}else if(A.length() < B.length()){
			System.out.println("LESS");
		}//ここまでで桁数違い//ここから同じ桁数
		else {	int i=0;
			while(A.charAt(i) == B.charAt(i)) {
				i++;
			}if(i==A.length()) {
				System.out.println("EQUAL");
			}else if(A.charAt(i+1) > B.charAt(i+1)) {
				System.out.println("GREATER");
			}else if(A.charAt(i+1) < B.charAt(i+1)){
				System.out.println("LESS");
			}
		}

	}

}
