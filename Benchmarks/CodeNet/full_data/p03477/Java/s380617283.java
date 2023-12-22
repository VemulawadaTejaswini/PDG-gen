import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//String t = sc.next();
		long n = sc.nextLong();
		long m = sc.nextLong();
		long k = sc.nextLong();
		long l = sc.nextLong();
		//long count=0;

		/*for(int i=0;i<3;i++) {
			if(s.substring(i,i+1).equals(s.substring(i+1,i+2))) {
				count++;
			}else if(i!=2){
				count=0;
			}
		}*/
		if(n+m<k+l) {
			System.out.println("Right");
		}else if(n+m>k+l){
			System.out.println("Left");
		}else {
			System.out.println("Balanced");
		}
		//System.out.println((int)Math.ceil((n+m)/2.0));
		//System.out.println(Math.ceil(5.5));
	}
}


