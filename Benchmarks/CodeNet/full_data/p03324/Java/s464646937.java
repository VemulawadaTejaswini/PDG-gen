public class RingoFavoriteNumbers {

	public static void main(String args[]){
		int d = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		int n1 = 0;
		int n2 = 0;

		if(n>(100^2)){
			n2 = n/(100^2);
		}
		if(n>100){
			n1 = n/100 - n2;
		}
		n = n+n1+n2;
		

		System.out.println((int)Math.pow(100,d)*n);

	}
}