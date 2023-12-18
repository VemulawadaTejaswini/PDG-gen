public class Main {
	public static void main(String[] args){
		int a,b,x,y;
		Scanner scan = new Scanner(System.in);
	     a = Integer.parseInt(scan.next());
		 b = Integer.parseInt(scan.next());
		if((a>=1)&&(b<=100)){
		x=a*b;
		y=(a+b)*2;
		System.out.println(x+" "+y);
		}
	}
}
