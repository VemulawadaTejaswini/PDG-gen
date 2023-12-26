public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h, w, c;
		c = 0;
		while (true) {
			h = scan.nextInt();
			w = scan.nextInt();
			if ((h == 0) & (w == 0)) {
				break;
			}
			for(int count = 0;count<h;count++){
				for(int count2 = 0;count2<w;count2++){
					if(c % 2 == 0){
						sb.append("#");
						c++;
					}else{
						sb.append(".");
						c++;
					}
				}
				sb.append("\n");
				c = count+1;
			}
			System.out.println(new String(sb));
			sb.delete(0, sb.length());
			c = 0;
		}
	}
}
