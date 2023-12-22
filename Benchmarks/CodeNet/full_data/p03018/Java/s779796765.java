import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		sc.close();

		int cnt=0;
		int lastABC_index=0;
		int lastBC_index=0;

		boolean flag_BC=false;

		for(int i=0;i<str.length()-3;i++){
			if(str.charAt(i)=='A' && str.charAt(i+1)=='B' && str.charAt(i+2)=='C'){
				cnt++;
				if(i>0 && str.charAt(i-1)=='A') cnt++;
				if(i<str.length()-5 && str.charAt(i+3)=='B' && str.charAt(i+4)=='C'){
					flag_BC=true;
					cnt++;
				}
				if(lastABC_index==i) cnt++;
				lastABC_index=i+3;
			}else if(flag_BC && str.charAt(i)=='B' && str.charAt(i+1)=='C'){
				if(lastBC_index==i){
					cnt++;
					lastBC_index=i+2;
				}
			}

		}

		System.out.println(cnt);

	}

}
