import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();

		int cnt = 0;
		while(true){
			if(K == cnt) break;
			cnt++;
			if(cnt==1){
				System.out.println(1);
			}
			else{
				String st = String.valueOf(cnt%9);
				if(st.equals("0")) st = "";
				for(int n=0;n<cnt/9;n++){
						st += "9";
				}
				System.out.println(st);
			}
			
		}

	}
}