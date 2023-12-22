import java.util.*;
public class Coins {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		int Y =  sc.nextInt();
		boolean bool = false;
			for(int a = 0;a <= N;a++){
				for(int b = 0;b <= N;b++){
					for(int c = 0;c <= N;c++){
						if(bool_func(a,b,c,Y,N)==true){
							System.out.println(a+" "+ b +" "+c);
							N = a = b = c;
							bool = true;
						}
					}
				}
			}
			if(bool == false)
			System.out.println("-1 -1 -1");
		}

	static boolean bool_func(int x,int y,int z,int Y,int N) {
		if(10000 * x + 5000 * y + 1000 * z == Y && (x + y + z) == N) {
			return true;
		}
		else {
			return false;
		}
	}
}