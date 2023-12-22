import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			String S = scan.next();
			char[] s = new char[N];
			s = S.toCharArray();
			RGB []map = new RGB[N];
			for(int i = 0;i<N;i++) {
				map[i] = new RGB(s[i]);
			}
			
			for(int i = 0;i<N;i++) {
				if(map[i].S=='R') {
					for(int j = i+1;j<N;j++) {
						if(map[j].S=='G')map[i].G++;
						if(map[j].S=='B')map[i].B++;
					}
				}
				if(map[i].S=='G') {
					for(int j = i+1;j<N;j++) {
						if(map[j].S=='R')map[i].R++;
						if(map[j].S=='B')map[i].B++;
					}
				}
				if(map[i].S=='B') {
					for(int j = i+1;j<N;j++) {
						if(map[j].S=='R')map[i].R++;
						if(map[j].S=='G')map[i].G++;
					}
				}	
			}
			
			long goukei=0;
			
			for(int i = 0;i<N-2;i++){
				if(map[i].S=='R') {
					for(int j = i+1;j<N-1;j++) {
						if(map[j].S=='B') {
							int k = j-i;
							if(j+k<N&&map[j+k].S=='G')goukei-=1;
							goukei+=map[j].G;	
						}
						if(map[j].S=='G') {
							int k = j-i;
							if(j+k<N&&map[j+k].S=='B')goukei-=1;
							goukei+=map[j].B;	
						}
					}
				}
				if(map[i].S=='G') {
					for(int j = i+1;j<N-1;j++) {
						if(map[j].S=='R') {
							int k = j-i;
							if(j+k<N&&map[j+k].S=='B')goukei-=1;
							goukei+=map[j].B;	
						}
						if(map[j].S=='B') {
							int k = j-i;
							if(j+k<N&&map[j+k].S=='R')goukei-=1;
							goukei+=map[j].R;	
						}
					}
				}
				if(map[i].S=='B') {
					for(int j = i+1;j<N-1;j++) {
						if(map[j].S=='R') {
							int k = j-i;
							if(j+k<N&&map[j+k].S=='G')goukei-=1;
							goukei+=map[j].G;	
						}
						if(map[j].S=='G') {
							int k = j-i;
							if(j+k<N&&map[j+k].S=='R')goukei-=1;
							goukei+=map[j].R;	
						}
					}
				}	
			}
			
			
			System.out.println(goukei);
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
class RGB{
	char S;
	int R;
	int G;
	int B;
	RGB(char k){
		S = k;
	}
}