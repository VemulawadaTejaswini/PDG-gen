import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] pa = a.split("");
		String b = "";
		for(int i = 0;i<pa.length;i++){
			if(i%2==0){
				b += pa[i];
			}
		}
		System.out.println(b);
	}
	
}