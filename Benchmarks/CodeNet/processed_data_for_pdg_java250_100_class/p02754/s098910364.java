public class Main {
	public static void main(String[] args) {
		int count=0;
		long blueCount=0;
		long aAmari=0;
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();
		long syou=N/(A+B);
		long kaisu=N%(A+B);
			if(kaisu==0) {
				blueCount=A*syou;
			}else {
				if(kaisu<A) {
					blueCount=(A*syou)+kaisu;
				}else {
				aAmari=kaisu-A;
				if(aAmari<B) {
					blueCount=(A*syou)+A;
				}else {
					aAmari=aAmari-B;
					blueCount=(A*syou)+A+aAmari;
				}
				}
			}
		System.out.println(blueCount);
	}
}
