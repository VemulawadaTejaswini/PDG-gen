import java.util.Scanner;

class Main{



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int ans =0;

		int aa = 0;
		int bb = 0;
		boolean a = false;
		boolean b = false;



		if(2*C <= A+B){

			while(aa < X && bb < Y){
				ans += 2*C;
				aa++;
				bb++;
				if(aa == X){
					a = true;

				}
				if(bb == Y){
					b = true;
				}

			}

			if(a){
				if(2*C > B){
					while(bb < Y){
						ans += B;
						bb++;
					}
				}else{
					while(bb < Y){
						ans += 2*C;
						bb++;
					}
				}
			}else{
				if(2*C > A){
					while(aa < X){
						ans += A;
						aa++;
					}
				}else{
					while(aa < X){
						ans += 2*C;
						aa++;
					}
				}
			}


		}else{

			while(aa != X){
				ans += A;
				aa++;
			}
			while(bb != Y){
				ans += B;
				bb++;
			}

		}

		System.out.println(ans);


	}

	static long comb(int n,int r){
		long ue = 1;
		for(int i = 0;i < r;i++){
			ue *= n-i;
		}
		long sita = 1;
		for(int i = 1;i <= r;i++){
			sita *= i;
		}
		return ue/sita;


	}





}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



