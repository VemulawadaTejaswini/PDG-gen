class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inta = sc.nextInt();
		int intb = sc.nextInt();
		sc.close();
		int intd = inta / intb;
		int intr = inta % intb;
		double dbf = (double)inta/intb;
		System.out.printf("%d %d %.7f%n",intd,intr,dbf);
	}
}
