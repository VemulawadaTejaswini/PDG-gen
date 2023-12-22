import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		if((A+B)<=C*2){
			System.out.println(A*X+B*Y);
			return;
		}
		if(X>=Y){
			int volume = 0;
			X -= Y;
			volume += C*Y*2;
			if(A<C*2){
				volume += X*A;
				System.out.println(volume);
			}else{
				volume += C*2*X;
				System.out.println(volume);
			}
		}else{
			int volume = 0;
			Y -= X;
			volume += C*X*2;
			if(B<C*2){
				volume += Y*B;
				System.out.println(volume);
			}else{
				volume += C*2*Y;
				System.out.println(volume);
			}
		}

	}

}
