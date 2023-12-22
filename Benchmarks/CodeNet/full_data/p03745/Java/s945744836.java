import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String [] array = br.readLine().split(" ");
		int result = 0;
		boolean continueFlag = true;
		int x1=0;
		int x2=0;
		int sa=Integer.parseInt(array[1]) -  Integer.parseInt(array[0]);
		for(int i=1; i<count-1 ;i++) {
			x1 = Integer.parseInt(array[i]);
			x2 = Integer.parseInt(array[i+1]);
			int xx = x2-x1;
			if(xx != 0) {
				if(!continueFlag) {
					sa = xx;
					continueFlag = true;
				}
				if(sa != xx) {
					result++;
					continueFlag = false;
				}
			}else {
				continueFlag = false;
			}
		}
		System.out.println(result+1);
	}
}