public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		int d = 0;
		int z = 0;
		int x = 0;
		int box[][][] = new int[4][3][10];
	while(n>c){
		int b = sc.nextInt();
		int f = sc.nextInt();
		int r = sc.nextInt();
		int v = sc.nextInt();
		if(box[b-1][f-1][r-1]==0){
			box[b-1][f-1][r-1]=v;
			z=v;
		}
		else{
			x=box[b-1][f-1][r-1]+v;
			box[b-1][f-1][r-1]=x;
		}
		c++;
	}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
			System.out.print(" "+box[i][j][k]);
				}
				System.out.println("");
			}
		if(d<3){
			System.out.println("####################");
			d++;
			}
		}
	}
}
