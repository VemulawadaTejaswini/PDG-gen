public class Main {
	public static void main(String[] args)throws IOException{
		Scanner file = new Scanner(System.in);
		int x =file.nextInt();
		if(x>=1 && x<=100){
			System.out.println(x * x * x);
		}
	}
}
