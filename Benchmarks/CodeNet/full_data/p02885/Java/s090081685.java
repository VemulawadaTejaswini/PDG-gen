
public class Curtain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a;
		int yoko;
		int sum = 0;

		yoko= Integer.parseInt(args[0]);
		a = Integer.parseInt(args[1]);


		if(yoko - 2*a> 0) {
			sum = yoko - 2*a;
		}else {
			sum = 0;
		}

		System.out.println(sum);

	}

}
