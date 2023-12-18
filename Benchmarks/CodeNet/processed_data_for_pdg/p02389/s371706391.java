public class Main {
	public static void main(String[] args){
		int a=0;
		int b=0;
		int M=0;
		int S=0;
		Scanner scan = new Scanner(System.in);
		a=Integer.parseInt(scan.next());
		b=Integer.parseInt(scan.next());
		M=a*b;
		S=2*a+2*b;
		System.out.println(M+" "+S);
    }
}
