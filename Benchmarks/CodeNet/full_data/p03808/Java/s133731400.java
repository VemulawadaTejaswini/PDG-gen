import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String []input = br.readLine().split(" ");
		boolean notFlag = false;
		boolean yesFlag = false;
		int num = 0;
		int co = 0;
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				notFlag = false;
				num = Integer.parseInt(input[j]);
				co = i+j+1;
				if(num%co != 0 && co <= count) {
					notFlag = true;
					break;
				}else if(co > count) {
					if(num%(co-count) != 0) {
						notFlag = true;
						break;
					}
				}
			}
			if(!notFlag) {
				yesFlag = true;
				break;
			}
		}
		if(yesFlag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}