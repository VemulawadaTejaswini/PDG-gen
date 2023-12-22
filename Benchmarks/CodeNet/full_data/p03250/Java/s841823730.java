import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

		int sum;

		if(b <= a){
			if(c <= a){
				sum = a*10 + b + c;
			}else{
				sum	= c*10 + b + a;
			}
		}else{
			if(c <= b){
				sum = b*10 + b + c;
			}else{
				sum	= c*10 + b + a;
			}
		}

			System.out.println(sum);
	}
}