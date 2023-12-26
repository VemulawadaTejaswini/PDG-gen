public class Main {
	public static void main(String[] args) throws IOException{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int d = 1;
		if(b == 0){
			return;
		}else{
			System.out.println("Case "+d+": "+b);
			b = a.nextInt();
			d++;
			while(b >0){
				System.out.println("Case "+d+": "+b);
				b = a.nextInt();
				d++;
			}
		}
	}
}
