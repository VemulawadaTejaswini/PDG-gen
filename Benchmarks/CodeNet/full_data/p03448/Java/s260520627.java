public class Min {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int a=sca.nextInt();
		int b=sca.nextInt();
		int c=sca.nextInt();
		int x=sca.nextInt();
		int y=0;
		for (int i=0;i<=a;i++) {
		for (int j=0;j<=b;j++) {
			for(int k=0;k<=c;k++) {
				if((500*i)+(100*j)+(50*k)==x) {
					y++;
				}
			}
		}
		}
		System.out.println(y);


	}

}
