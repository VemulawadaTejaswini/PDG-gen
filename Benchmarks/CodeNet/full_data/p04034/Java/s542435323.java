import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String input[] = br.readLine().split(" ");
		//[x][0] = ボールの個数
		//[x][1] = 赤のボールがある
		//[x][2] = 赤のボールが入れられた
		int boxCount = Integer.parseInt(input[0]);
		Long[][] box =new Long [boxCount][3];
		for(int i=0;i<boxCount;i++) {
			for(int j=0;j<3;j++) {
				box[i][j]=0l;
			}
		}
		box[0][1] = 1l;
		int order = Integer.parseInt(input[1]);
		while(br.ready()) {
			String temp[] = br.readLine().split(" ");
			int before = Integer.parseInt(temp[0]);
			int after = Integer.parseInt(temp[1]);
			if(box[before-1][0] >= 0l) {
				box[before-1][0]--;
				box[after-1][0]++;
				if(box[before-1][1]==1) {
					box[before-1][1] = 0l;
					box[after-1][1] = 1l;
					box[after-1][2] = 1l;
				}
			}
		}
		int result = 0;
		for(int i =0 ;i<boxCount ; i++) {
			if(box[i][0] >= 0l) {
				if(box[i][2] == 1l) {
					result++;
				}
			}
		}
		System.out.println(result);

	}

}