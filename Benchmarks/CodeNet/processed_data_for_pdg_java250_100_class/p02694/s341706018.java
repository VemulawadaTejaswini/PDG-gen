public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		int i=0;
		double yokin=100;
		for(i=0;yokin<x;i++) {	
			yokin=yokin*1.01;
			yokin=Math.floor(yokin);
		}
		System.out.println(i);
		sc.close();
	}
}
