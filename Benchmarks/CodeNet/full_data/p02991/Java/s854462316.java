import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));

		String[] s = readLine();
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		
		int[][] uv = new int[M][2];
		for(int i=0;i<M;i++) {
			String[] st = readLine();
			uv[i][0] = Integer.parseInt(st[0])-1;
			uv[i][1] = Integer.parseInt(st[1])-1;
		}
		s = readLine();
		int S = Integer.parseInt(s[0])-1;
		int T = Integer.parseInt(s[1])-1;
		
		int[] VM = new int[N*3];
		boolean[] checked = new boolean[N*3];
		for(int i=0;i<N*3;i++) {
			VM[i]=(i==S)?0:Integer.MAX_VALUE; 
			checked[i]=false; 
		}
		boolean changed;
		do {
			changed = false;
			for(int i=0;i<N*3;i++) {
				if(VM[i]!=Integer.MAX_VALUE&&!checked[i]) {
					//1ステップ
					int step_now = VM[i];
					for(int j=0;j<M;j++) {
						if(uv[j][0]==(i%N)) {
							VM[(uv[j][1]+N*(i/N)+N)%(3*N)]=step_now+1;
						}
					}
					checked[i]=true;
					changed = true;
					break;
				}
			}
		}while(changed);
		if(VM[T]==Integer.MAX_VALUE) {print(-1);}
		else {print(VM[T]/3);}
	}

	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}