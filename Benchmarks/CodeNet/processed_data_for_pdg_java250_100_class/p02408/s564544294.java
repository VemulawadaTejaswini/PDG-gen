public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = 0;
	int a = sc.nextInt();
	int card[][]= {{1,2,3,4,5,6,7,8,9,10,11,12,13},
					{1,2,3,4,5,6,7,8,9,10,11,12,13},
					{1,2,3,4,5,6,7,8,9,10,11,12,13},
					{1,2,3,4,5,6,7,8,9,10,11,12,13}};
	int j=0;
while(d<a){
	String m = sc.next();
	int b = sc.nextInt();
			if(m.equals("S")){
				card[0][b-1]=0;
			}
			if(m.equals("H")){
				card[1][b-1]=0;
			}
			if(m.equals("C")){
				card[2][b-1]=0;
			}
			if(m.equals("D")){
				card[3][b-1]=0;
			}
			d++;
	}
	while(j<3){
		for(int k =0;k<13;k++){
		if(card[0][k]!=0)
			System.out.println("S "+card[j][k]);
		}
		j=j+1;
		for(int k =0;k<13;k++){
		if(card[1][k]!=0)
			System.out.println("H "+card[j][k]);
		}
		j=j+1;
		for(int k =0;k<13;k++){
		if(card[2][k]!=0)
			System.out.println("C "+card[j][k]);
		}
		j=j+1;
		for(int k =0;k<13;k++){
		if(card[3][k]!=0)
			System.out.println("D "+card[j][k]);
		}
	  }
	}
}
