class Main {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		int num;
		double hen = 0;
		double sum = 0;
 		double hei = 0;
		double ten[];
		String str;
		while(true){
			num = as.nextInt();
			if(num == 0){
				break;
			}
			ten = new double[num];
			for(int i=0;i<num;i++){
				ten[i] = as.nextDouble();
				hei = hei + ten[i];
			}
			hei = hei / num;
			for(int i=0;i<num;i++){
				sum = sum + (ten[i]-hei)*(ten[i]-hei);
			}
			hen = Math.sqrt(sum/num);
			str = String.valueOf(hen);
			System.out.println(str);
			hei = 0;
			sum = 0;
			hen = 0;
		}
	}
}
