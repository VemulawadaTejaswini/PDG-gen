public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tate = sc.nextInt();
		int yoko = sc.nextInt();
		int menseki = tate * yoko;
		int syuu = (tate + yoko) * 2;
		System.out.println(menseki +" "+ syuu);
	}
}
