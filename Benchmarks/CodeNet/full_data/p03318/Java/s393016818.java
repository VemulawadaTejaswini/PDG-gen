import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long k = sc.nextLong();
//
	
//		for(int i = 400;i < 1000;i++){
//			int S = 0;
//			if(i <= 9){
//				S = i;
//			}else if(i > 9 && i < 100){
//				S = i/10;
//				S = S + (i - S*10 );
//			}else{
//				S = i/100;
//				int SS = 0;
//				SS = i - S*100;
//				S = S + (SS/10) + (SS - SS/10*10);
//			}
////				System.out.println("i " + i+" S "+ S+" sunuke "+ (double)((double)i / S));
//			
//		}
		long count = 0;
		int number = 1;


		StringBuilder sb = new StringBuilder();
				while(true){
					if(count == k){
						return;
					}
					sb.insert(0,String.valueOf(number));
					System.out.println(sb.toString());
					sb.deleteCharAt(0);
					number++;
					count++;
					if(number == 10){
						number = 1;
						sb.append("9");
					}
				}



	}

}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

