public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		int intSeito = sc.nextInt();
		if(intSeito == 0){
			break;
			}
		int  [] Ten =new int [intSeito];
		double dbHeikin = 0;
		double dbKekka = 0;
		double dbGoukei = 0;
		for(int i = 0; i < intSeito ; i ++){
			Ten [i] = sc.nextInt();
			dbGoukei += Ten[i];
		}
		dbHeikin = dbGoukei/intSeito;
		for(int j = 0; j < intSeito ; j++){
			dbKekka += Math.pow(Ten[j]-dbHeikin,2);
		}
        dbKekka= Math.sqrt(dbKekka/(double)intSeito);
        System.out.println(dbKekka);
		}
	}
}
