import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=1;i<s.length();i++){
			
			String si=s.substring(0, s.length()-i);
			
			if(si.length()%2==0){
				if(si.substring(0, si.length()/2).equals(si.substring(si.length()/2,si.length()))){
					System.out.println(si.length());
					return;
				}
			}
		}
		
	}

}
