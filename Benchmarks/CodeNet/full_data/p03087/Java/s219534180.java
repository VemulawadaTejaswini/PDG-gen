import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int q = s.nextInt();
		String inS = s.next();
		
		for(int i=0; i<q ;i++) {
			int start = s.nextInt();
			int end = s.nextInt();
			String sub = "Z" + inS.substring(start - 1 , end) + "Z";
			String[] array = sub.split("AC");
			if(array.length == 0) {
				System.out.println(0);
			} else {
				System.out.println(array.length -1);
			}
		}
		
		s.close();
		
	}

}