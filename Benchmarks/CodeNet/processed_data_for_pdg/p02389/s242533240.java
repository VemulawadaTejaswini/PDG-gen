public class Main{
	public static void main(String[] args){
		int a,b,W,H;
		Scanner br=new Scanner(System.in);
		a=br.nextInt();
		b=br.nextInt();
		W=a*b;
		H=(a+b)*2;
		System.out.println(W+" "+H);
	}
}
