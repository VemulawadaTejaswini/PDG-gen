import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Person{
		int x[];
		int y[];
		Person(int N){
			x = new int[N];
			y = new int[N];
		}
	}
	static boolean can(Person ps[] , int bit){
		int N = ps.length;
		int bs[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			bs[i] = (bit & (1 << i) ) == 0 ? 0 : 1;
		}
//		System.out.println(Arrays.toString(bs));
		for(int i = 0 ; i < N ; ++i){
			Person p = ps[i];
			int py = bs[i];
			for(int a = 0 ; a < p.x.length ; ++a){
				int x = p.x[a];
				int y = p.y[a];
				if(py == 0){
					
				}else{
					if(bs[x] == y){
						
					}else{
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Person ps[] = new Person[N];
		for(int i = 0 ; i < N ; ++i){
			int A = sc.nextInt();
			Person p = new Person(A);
			for(int a = 0 ; a < A ; ++a){
				p.x[a] = sc.nextInt() - 1;
				p.y[a] = sc.nextInt();
			}
			ps[i] = p;
		}
		int ret = 0;
		for(int bit = 0 ; bit < (1 << N) ; ++bit){
			if(can(ps , bit)){
//				System.out.println(bit);
				ret = Math.max(ret, Integer.bitCount(bit));
			}
		}
		System.out.println(ret);
	}
}
