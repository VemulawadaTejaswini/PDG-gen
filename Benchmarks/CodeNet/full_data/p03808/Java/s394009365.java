import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String []input = br.readLine().split(" ");
		boolean notFlag = false;
		boolean yesFlag = false;
		Long num = 0l;
		int co = 0;
		for(int m=0 ; m<2;m++) {
			for(int i=0;i<count;i++) {
				for(int j=0;j<count;j++) {
					notFlag = false;
					if(m==0) {
						num = Long.parseLong(input[j]);
					}else{
						num = Long.parseLong(input[count-j-1]);
					}
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
