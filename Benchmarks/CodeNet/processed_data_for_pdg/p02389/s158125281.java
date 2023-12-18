public class Main{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a<1){a=1;}
		if(b>100){b=100;}
		int menseki=a*b;
		int syuu=2*(a+b);
		System.out.println(menseki+" "+syuu);
	}
}
