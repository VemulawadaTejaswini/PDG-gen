public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int m,f,r;
		m = 0;
		f = 0;
		r = 0;
		while(true){
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			if((m == -1) & (f == -1) & (r == -1)){
				break;
			}
			if((m == -1) | (f == -1)){
				sb.append("F");
				sb.append("\n");
			}else if((m + f)>=80){
				sb.append("A");
				sb.append("\n");
			}else if((m + f)>=65){
				sb.append("B");
				sb.append("\n");
			}else if((m + f)>=50){
				sb.append("C");
				sb.append("\n");
			}else if((m + f)>=30){
				if(r >= 50){
				sb.append("C");
				sb.append("\n");
				}else{
					sb.append("D");
					sb.append("\n");
				}
			}else if((m+f)<30){
				sb.append("F");
				sb.append("\n");
			}
		}
		System.out.print(new String(sb));
	}
}
