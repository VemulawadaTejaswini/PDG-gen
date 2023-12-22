import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)==82&&s.charAt(i+1)==76){
				int hoz = i;
				int rcnt = 0;
				int lcnt = 0;
				int k = 0;
				for(;s.charAt(hoz)==82&&hoz>=0;hoz--){
					if(k==0){
						lcnt++;
					}else{
						rcnt++;
					}
					k=1-k;
					if(hoz == 0)break;
				}
				hoz = i+1;
				k = 1;
				for(;s.charAt(hoz)==76&&hoz<s.length();hoz++){
					if(k==0){
						lcnt++;
					}else{
						rcnt++;
					}
					k=1-k;
					if(hoz == s.length()-1)break;
				}
				System.out.print(lcnt + " " + rcnt + " ");
				i++;
			}else{
				System.out.print(0 + " ");
			}
		}
	}
}
