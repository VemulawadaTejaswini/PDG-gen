public class Main {

	public static void main(String[] args) {
		int z = Integer.parseInt(args[0]);
		int[][] x = new int[3][z];

		int u = 1;
		for(int i=0; i<x.length; i++){
			for(int j=0; j<x[i].length; j++){
				x[i][j] = Integer.parseInt(args[u]);
				u++;
			}
		}

		int cnt = 0;
		for(int i=0; i<z; i++){
			for(int j=0; j<z; j++){
				if(x[0][i]<x[1][j]){
					for(int k=0; k<z; k++){
						if(x[1][j]<x[2][k]){
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
