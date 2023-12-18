public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vertical=sc.nextInt();
		int cross=sc.nextInt();
		int menseki=vertical*cross;
		int gaisyu=(vertical+cross)*2;
		System.out.println(menseki+" "+gaisyu);
	}
}
