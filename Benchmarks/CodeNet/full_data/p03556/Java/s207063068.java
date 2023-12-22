public class Main {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = 0;
		double z = Math.sqrt(1000000000);
		int a = 0;
		for(int i=1; i<=z; i++){
			a = i*i;
			if(a<x){
				y = a;
			}else if( a == x){
				System.out.println(x);
				y = -1;
				break;
			}else if(a > x){
				break;
			}
		}

		if( y != -1){
			System.out.println(y);
		}

	}

}
