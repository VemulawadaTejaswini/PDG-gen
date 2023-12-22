import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int max = 1;
		int x = scan.nextInt();

		for(int i = 1; i <= x; i++){
			int abs = 0;
			for(int j = 2; j <= x; j++){

				abs =(int) Math.pow((double)i, (double)j);

				if(abs > x){
					break;
				}
				if(abs > max){
					max = abs;
				}
			}
		}
		System.out.println(max);
	}
}	