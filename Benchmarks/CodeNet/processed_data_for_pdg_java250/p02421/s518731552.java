public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intTrun = sc.nextInt();
		String Hanaco;
		String Taro;
		int intHanacop = 0;
		int intTarop = 0;
		for (int i = 0; i < intTrun; i++) {
			Taro = sc.next();
			Hanaco = sc.next();
			if (Taro.compareToIgnoreCase(Hanaco) > 0) {
				intTarop += 3;
			}else if (Taro.compareToIgnoreCase(Hanaco) < 0 ){
				intHanacop += 3;
			}else if (Taro.compareToIgnoreCase(Hanaco) == 0){
				intTarop ++;
				intHanacop ++;
			}
		}
		System.out.println( intTarop + " " + intHanacop);
	}
}
