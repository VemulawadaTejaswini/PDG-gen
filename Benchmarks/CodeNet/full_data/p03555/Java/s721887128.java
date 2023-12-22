public class Main {

	public static void main(String[] args) {
		char[][] x = new char[2][3];
		for(int i=0; i<2; i++){
			x[i] = args[i].toCharArray();
		}

		int p = 0;
		for(int j=0; j<3; j++){
			if(x[0][j] != x[1][2-j]){
				System.out.println("NO");
				p = 1;
				break;
			}
		}
		if(p == 0){
			System.out.println("YES");
		}


	}

}
