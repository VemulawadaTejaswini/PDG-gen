import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		String [] array = br.readLine().split(" ");
		int result = 1;
		boolean continueFlag = true;
		long x1=0;
		long x2=0;
		long sa = 0;
		if(count != 1) {
				sa=Long.parseLong(array[1]) -  Long.parseLong(array[0]);
			for(int i=1; i<count-1 ;i++) {
				x1 = Long.parseLong(array[i]);
				x2 = Long.parseLong(array[i+1]);
				long xx = x2-x1;
				if(xx != 0) {
					if(!continueFlag) {
						sa = xx;
						continueFlag = true;
					}else if(sa != xx) {
						if(sa != 0) {
							result++;
						}
						continueFlag = false;
					}
				}
			}
		}
		System.out.println(result);
	}
}