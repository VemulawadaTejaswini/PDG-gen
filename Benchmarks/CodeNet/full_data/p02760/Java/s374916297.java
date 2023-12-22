import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int A[] = new int[9];
		for(int ij = 0; ij<9;ij++){

			A[ij]= scanner.nextInt();
		}

		int N =scanner.nextInt();

		int B;

		ArrayList<Integer> result =new ArrayList<Integer>();

		for(int b=0; b<N;b++){
			B=scanner.nextInt();
			
			if(A[0]==b||A[1]==b||A[2]==b||A[3]==b||A[4]==b||A[5]==b||A[6]==b||A[7]==b||A[8]==b){
				result.add(b);
				}
			}

			if((result.contains(0)&&result.contains(1)&&result.contains(2))
					||(result.contains(3)&&result.contains(4)&&result.contains(5))
					||(result.contains(6)&&result.contains(7)&&result.contains(8))
					||(result.contains(0)&&result.contains(3)&&result.contains(6))
					||(result.contains(1)&&result.contains(4)&&result.contains(7))
					||(result.contains(2)&&result.contains(5)&&result.contains(8))
					||(result.contains(2)&&result.contains(4)&&result.contains(6))
					||(result.contains(0)&&result.contains(4)&&result.contains(8))){
				System.out.println("Yes");

			}else{
				System.out.println("No");
			}

	}

}
