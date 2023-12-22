import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int [][] data = new int[h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
			StringBuilder sb = new StringBuilder();
			int indh = 0, indw = 0, add = 1;
			String prev = null;
			boolean find = false;
			int count = 0;
			for(int i = 0; i < h; i++){
				if(i % 2 == 0){
					for(int j = 0; j < w; j++){
						if(find){
							if(data[i][j] % 2 == 0){
								count++;
								sb.append(prev + " " + (i + 1) + " " + (j + 1));
								sb.append("\n");
								prev = (i + 1) + " " + (j + 1);
							}
							else{
								find = false;
								count++;
								sb.append(prev + " " + (i + 1) + " " + (j + 1) );
								sb.append("\n");
								prev = (i + 1) + " " + (j + 1);
							}
							
						}
						else{
							if(data[i][j] % 2 == 0){
							}
							else{
								find = true;
								prev = (i + 1) + " " + (j + 1);
							}
						}
					}
				}
				else{
					for(int j = w-1; j >= 0; j--){
						if(find){
							if(data[i][j] % 2 == 0){
								count++;
								sb.append(prev + " " + (i + 1) + " " + (j + 1) );
								sb.append("\n");
								prev = (i + 1) + " " + (j + 1);
							}
							else{
								find = false;
								count++;
								sb.append(prev + " " + (i + 1) + " " + (j + 1) );
								sb.append("\n");
								prev = (i + 1) + " " + (j + 1);
							}
							
						}
						else{
							if(data[i][j] % 2 == 0){
							}
							else{
								find = true;
								prev = (i + 1) + " " + (j + 1);
							}
						}
					}
				}
			}
			System.out.println(count);
			System.out.print(sb.toString());
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
