import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int max = 0;
		int x = scan.nextInt();

		for(int i = 1; i <= x; i++){
			int abs = 0;
			for(int j = 2; j <= x && abs < x; j++){
				abs =(int) Math.pow((double)i, (double)j);
				if(abs <= x && abs > max){
					max = abs;
				}
				if(abs > x){
					break;
				}
			}
		}
		System.out.println(max);
	}
}	