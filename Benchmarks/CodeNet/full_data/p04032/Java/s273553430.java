import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int len = s.length();

		for(int i=0; i<len; i++){
			String a = s.substring(i, i+1);
			int n = 1;
			int an = 1;
			for(int j=i+1; j<len; j++){
				if((s.substring(j, j+1)).equals(a)){
					an++;
					n++;
					if(an > n/2){
						System.out.println(i+1 + " " + (j+1));
						return ;
					}
				}else{
					n++;
					if(n % 2 == 0){
						if(an < n/2) break;
					}else{
						if(an <= n/2) break;
					}
				}
			}
			
		}
		System.out.println("-1 -1");
		return;
	}
}
