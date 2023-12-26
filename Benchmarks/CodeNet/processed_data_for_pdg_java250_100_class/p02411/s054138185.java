public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int m,f,r;
		int x[][] = new int[51][3];
		int i = 0;
		while(true){
			m = stdIn.nextInt();
			f = stdIn.nextInt();
			r = stdIn.nextInt();
			if ((m==-1)&&(f==-1)&&(r==-1)) {
				break;
			} else {
				x[i][0] = m;
				x[i][1] = f;
				x[i][2] = r;
				i++;
			}
		}
		stdIn.close();
		for(int j=0;j<i; j++) {
			if(x[j][0]==-1 ||x[j][1]==-1) {
				System.out.println("F");
			} else if((x[j][0] + x[j][1]) >=80) {
				System.out.println("A");
			} else if((x[j][0] + x[j][1]) >=65) {
				System.out.println("B");
			} else if((x[j][0] + x[j][1]) >=50) {
				System.out.println("C");
			} else if((x[j][2]) >=50) {
				System.out.println("C");
			} else if((x[j][0] + x[j][1]) >=30) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}
