import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int ans = 0;
		int ab = 0;
		int flag = 0;
		for(int i = 0; i < n; i++){
			String s = sc.next();
			String atmp = s.substring(s.length()-1,s.length());
			String btmp = s.substring(0,1);
			if(atmp.equals("A")){
				a++;
			}
			if(btmp.equals("B")){
				b++;
			}
			if(atmp.equals("A")&&btmp.equals("B")){
				ab++;
			}
			for(int j = 0; j < s.length()-1; j++){
				if(s.substring(j,j+2).equals("AB")){
					ans++;
				}
			}
		}
		if(a==b&&a==ab){
			flag = 1;
		}
		System.out.print(ans+Math.min(a,b)-flag);
	}
}
