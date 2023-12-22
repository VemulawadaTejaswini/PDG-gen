class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double dbr = sc.nextDouble();
		double dbensyuu = Math.PI;
		System.out.printf("%.5f  %.5f" ,  dbr * dbr * dbensyuu , (dbr + dbr) * dbensyuu);
	}
}
