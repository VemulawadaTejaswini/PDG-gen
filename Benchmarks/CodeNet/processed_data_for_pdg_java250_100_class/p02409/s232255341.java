public class Main {
	public static void main(String []args){
		Scanner sc =  new Scanner(System.in);
		int [][][] list= new int[4][3][10];
		int b = 0;
		int f = 0;
		int r = 0;
		int v = 0;
		int n = sc.nextInt();
			for(int i = 0; i<n;i++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			list [b -1][f-1][r-1] += v;
		}
			for(int i = 0; i <  4;i++){
				if(i != 0){
					System.out.println("####################");
				}else{
				}
				for(int j = 0; j < 3; j++){
					for(int k = 0; k < 10; k++){
						if(k == 9){
							System.out.println(" " + list[i][j][k]);
						}else{
							System.out.print(" " + list[i][j][k]);
						}
					}
				}
			}
	}
}
