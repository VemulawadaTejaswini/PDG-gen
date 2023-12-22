import java.util.Scanner;;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int s1 = sc.nextInt();
		if(s1 == 1) {count = count + 1;}
		int s2 = sc.nextInt();
		if(s2 == 1) {count = count + 1;}
		int s3 = sc.nextInt();
		if(s3 == 1) {count = count + 1;} 
		System.out.print((count));
	}

}
