public class Main {
	public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
double x=kb.nextDouble();
double y=kb.nextDouble();
int p=(int)x/(int)y;
int q=(int)x%(int)y;
System.out.printf("%d %d %f\n",p,q,x/y);
	}
}
