import java.util.Scanner;

class Main{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if(b <= d){
			if(c <= b){
				if(a >= c){
					System.out.println(b-a);

				}else{
					System.out.println(b-c);
				}
			}else{
				System.out.println(0);

			}
		}else{				//b>d
			if(d >= a){
				if(a <= c){
					System.out.println(d-c);
				}else{
					System.out.println(d-a);

				}

			}else{
				System.out.println(0);

			}
		}

	}
}