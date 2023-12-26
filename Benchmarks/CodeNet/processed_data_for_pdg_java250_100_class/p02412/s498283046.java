public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n, x, c, result,min,max;
		n = 0;
		x = 0;
		c = 1;
		result = 0;
		min = 1;
		max = 0;
		while (true) {
			n = scan.nextInt();
			x = scan.nextInt();
			if ((n == 0) & (x == 0)) {
				break;
			}
			max = n;
			min = 1;
			result=0;
			c = 1;
			for(;min<=(n-2);min++){
				c = min + 1;
				while(true){
					if(max == c){
						c++;
						max = n;
						if(c == max){break;}
					}else if((min + c + max) == x){
						result++;
						max--;
					}else{
						max--;
					}
				}
			}
			sb.append(result).append("\n");
		}
		System.out.print(new String(sb));
	}
}
