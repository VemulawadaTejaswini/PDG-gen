import java.util.Scanner;


class main{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		int N =  scan.nextInt();
		int keta = String.valueOf(N).length();		//桁数が返されるは"+
		int m = keta;
		int sum = 0;			//合計値


		for(int j = 0;j < m;j++){
			int waru = 1;
			if(keta != 0){
				for(int i = keta-1;i > 0;i--){
					waru *= 10;
					System.out.println(waru);
				}
			}
			
			sum += N/waru;
			System.out.println("sumは"+sum);
			keta--;
			N -= (N/waru)*waru;
			System.out.println("Nは"+N);

		}
		System.out.println(sum);
		if(N%sum == 0){
			System.out.println("Yes");

		}else{
			System.out.println("NO");
		}

	}
}