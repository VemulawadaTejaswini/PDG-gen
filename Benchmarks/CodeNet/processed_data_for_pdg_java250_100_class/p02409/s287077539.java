public class Main {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int nowLives[][][]=new int[5][4][10];
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<10;k++){
					nowLives[i][j][k]=0;
				}	
			}
		}
		int n=kb.nextInt();
		int b,f,r,v;
		for(int i=0;i<n;i++){
		    b=kb.nextInt();f=kb.nextInt();
            r=kb.nextInt();v=kb.nextInt();
			nowLives[b-1][f-1][r-1]+=v;
		}
		for(int k=0;k<4;k++){
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
System.out.printf(" %d",nowLives[k][i][j]);
			}
			System.out.println();
		}
		if(k!=3){
		System.out.println("####################");
		}
		}
	}
}
