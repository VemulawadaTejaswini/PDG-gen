public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in); 
		StringBuilder out = new StringBuilder(); 
		StringBuilder output = new StringBuilder(); 
		while (true) { 
			int H = sc.nextInt(); 
			int W = sc.nextInt(); 
			if (H + W == 0) 
				break;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)){
						out = out.append("#");
					}else{
						out = out.append(".");
					}
				}
				out = out.append("\n");
			}
			output = output.append(out + "\n"); 
			out.delete(0, out.length()); 
		}
		System.out.print(output); 
		sc.close();
	}
}
