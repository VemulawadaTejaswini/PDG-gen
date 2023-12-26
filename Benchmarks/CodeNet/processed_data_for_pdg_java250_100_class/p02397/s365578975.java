public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(true){
			int in1 = sc.nextInt();
			int in2 = sc.nextInt();
			if(in1 == 0 && in2 == 0) break;
			if(in1 > in2){
				int d = in1;
				in1 = in2;
				in2 = d;
			}
			System.out.println(in1 + " " + in2);
		}
	}
}
