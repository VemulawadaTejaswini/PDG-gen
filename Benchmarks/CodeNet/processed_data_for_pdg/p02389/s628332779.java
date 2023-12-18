public class Main{
	public static void main(String[] args){
	int a, b, m = 0, l = 0;
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		if(a >= 1 || b<= 100){
			m = a * b;
			l = (a + b) * 2;
		}else{
		}
		System.out.println(m + " " + l);
	}
}
