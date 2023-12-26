public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();		
		long a=sc.nextLong();		
		long b=sc.nextLong();		
		long sum=n / (a+b)*a;
		long result=n % (a+b);
		if(result>=a) {
			sum+=a;
		}else {
			sum+=result;
		}
		System.out.println(sum);
		sc.close();
	}
}
