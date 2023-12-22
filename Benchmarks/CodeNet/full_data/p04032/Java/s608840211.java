import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();

		for(int i=0; i<s.length(); i++){
			String a = s.substring(i, i+1);
			int n = 1;
			int an = 1;
			String t;
			String str = a;
			for(int j=i+1; j<s.length(); j++){
				if((t = s.substring(j, j+1)).equals(a)){
					an++;
					n++;
					if(an > n/2){
						System.out.println(i+1 + " " + (j+1));
						return ;
					}
				}else{
					n++;
					str = str + t;
				}
			}
			
		}
		System.out.println("-1 -1");
		sc.close();
		return;
	}
}
