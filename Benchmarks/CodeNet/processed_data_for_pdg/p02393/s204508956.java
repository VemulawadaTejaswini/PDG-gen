public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int number1=0;
		int number2=0;
		int number3=0;
		if(a<=b && b<=c) {
			number1=a; number2=b; number3=c;
		}else if (a<=c && b>=c) {
			number1=a; number2=c; number3=b;
		}else if(b<=a &&a<=c) {
			number1=b; number2=a; number3=c;
		}else if(b<=c && c<=a) {
			number1=b; number2=c; number3=a;
		}else if(c<=a && a<=b) {
			number1=c; number2=a; number3=b;
		}else if(c<=b && b<=a) {
			number1=c; number2=b ;number3=a;
		}
		System.out.println(number1+" "+number2+" "+number3);
	}
}
