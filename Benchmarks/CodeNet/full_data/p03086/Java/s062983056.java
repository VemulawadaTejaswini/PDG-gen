
import java.util.Scanner;
// B
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int max=0,cnt=0;
		String str=scn.next();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A'||str.charAt(i)=='T'||str.charAt(i)=='C'||str.charAt(i)=='G') {
				cnt=1;
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(j)=='A'||str.charAt(j)=='T'||str.charAt(j)=='C'||str.charAt(j)=='G') {
						cnt++;
					}else {
						break;
					}
				}
				if(max<cnt) {
					max=cnt;
				}
			}
			
			//System.out.println(max);
		}
		System.out.println(max);
	}

}
