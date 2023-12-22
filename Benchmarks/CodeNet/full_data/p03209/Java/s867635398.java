import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long X = sc.nextLong();

		Burger burger = null;
		for(int i=0;i<=N;i++) {
			burger = new Burger(i,burger);
		}

		System.out.println(search(N,0,X,burger));
	}
	public static long search(int lvl, long ret, long X, Burger bur) {
//		System.out.println("lv "+lvl+" ret "+ret+" x "+X+" byr "+bur);
		if(bur.level==0) {
			return ret+1;
		}
		if(X==1) {
			return ret;
		}
			if(mid(bur.size)==X) {
				ret+=bur.previos.paty+1;

			} else if(bur.size==X){
				ret+=bur.paty;

			} else if(X==0) {

			} else {
				if(bur.size/2 < X) {
					ret+=bur.previos.paty+1;
					ret=search(lvl-1, ret, X-bur.previos.size-2, bur.previos);
				} else {
					ret=search(lvl-1, ret, X-1, bur.previos);
				}

			}

		return ret;
	}
	public static long mid(long size) {
		return size/2+size%2;
	}
	static class Burger{
		int level;
		long pan;
		long paty;
		long size;
		Burger previos;
		Burger(int lvl,Burger bur){
			level=lvl;
			if(lvl==0) {
				previos=null;
				pan=0;
				paty=1;
			}else {
				previos=bur;
				pan=2+bur.pan*2;
				paty=1+bur.paty*2;
			}
			size=pan+paty;
		}
	}
}
