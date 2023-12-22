import java.util.Scanner;

class Main{

	public static void main(String[] args) {



		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();

		int min = 10000;
		for(int i = 0;i < N;i++){
			String left = S.substring(0,i);
			String right = S.substring(i+1);
//			System.out.println("left " +left );
//			System.out.println("right " + right);

			int count = 0;
			if(!(left.length()==0)){
				for(int j = 0;j < left.length();j++){
					if(left.charAt(j) == 'W'){
						count++;
					}
				}
			}
			for(int j = 0;j < right.length();j++){
//				System.out.println("j " +j );
//				System.out.println(right.charAt(j));


				if(right.charAt(j) == 'E'){
					count++;
				}
			}

//			System.out.println("count " +count );
//			System.out.println();

			min = Math.min(min, count);


		}
		System.out.println(min);






	}
}






